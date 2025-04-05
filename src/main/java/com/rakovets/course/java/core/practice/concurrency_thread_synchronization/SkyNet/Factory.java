package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factory {
    boolean isNight;
    private Map<String, Integer> mapOfDetails;
    public static Logger logger = Logger.getLogger(Factory.class.getName());

    public Factory() {
        mapOfDetails = new HashMap<>();
        mapOfDetails.put("head", 0);
        mapOfDetails.put("torso", 0);
        mapOfDetails.put("hand", 0);
        mapOfDetails.put("feet", 0);
    }

    void disableNight() {
        isNight = false;
    }

    void enableNight() {
        isNight = true;
    }

    public void produceDetails() {
        mapOfDetails.put("head", mapOfDetails.get("head") + (int) ((Math.random() * 10) + 1));
        mapOfDetails.put("torso", mapOfDetails.get("torso") + (int) ((Math.random() * 10) + 1));
        mapOfDetails.put("hand", mapOfDetails.get("hand") + (int) ((Math.random() * 10) + 1));
        mapOfDetails.put("feet", mapOfDetails.get("feet") + (int) ((Math.random() * 10) + 1));
    }

    public Map<String, Integer> getMapOfRemovedDetails(Map<String, Integer> originalMapDetails) {
        Map<String, Integer> mapOfRemovedDetails = new HashMap<>();
        mapOfRemovedDetails.put("head", originalMapDetails.get("head") - mapOfDetails.get("head"));
        mapOfRemovedDetails.put("torso", originalMapDetails.get("torso") - mapOfDetails.get("torso"));
        mapOfRemovedDetails.put("hand", originalMapDetails.get("hand") - mapOfDetails.get("hand"));
        mapOfRemovedDetails.put("feet", originalMapDetails.get("feet") - mapOfDetails.get("feet"));
        return mapOfRemovedDetails;
    }

    public Map<String, Integer> removeDetails() {
        Map<String, Integer> originalMapDetails = new HashMap<>(mapOfDetails);
        Map<String, Integer> mapOfRemovedDetails;
        if (mapOfDetails.get("head") > 4) {
            mapOfDetails.put("head", mapOfDetails.get("head") - (int) ((Math.random() * 5) + 1));
        } else {
            mapOfDetails.put("head", mapOfDetails.get("head") - (int) ((Math.random() * mapOfDetails.get("head")) + 1));
        }
        if (mapOfDetails.get("torso") > 4) {
            mapOfDetails.put("torso", mapOfDetails.get("torso") - (int) ((Math.random() * 5) + 1));
        } else {
            mapOfDetails.put("torso", mapOfDetails.get("torso") - (int) ((Math.random() * mapOfDetails.get("torso")) + 1));
        }
        if (mapOfDetails.get("hand") > 4) {
            mapOfDetails.put("hand", mapOfDetails.get("hand") - (int) ((Math.random() * 5) + 1));
        } else {
            mapOfDetails.put("hand", mapOfDetails.get("hand") - (int) ((Math.random() * mapOfDetails.get("hand")) + 1));
        }
        if (mapOfDetails.get("feet") > 4) {
            mapOfDetails.put("feet", mapOfDetails.get("feet") - (int) ((Math.random() * 5) + 1));
        } else {
            mapOfDetails.put("feet", mapOfDetails.get("feet") - (int) ((Math.random() * mapOfDetails.get("feet")) + 1));
        }
        mapOfRemovedDetails = getMapOfRemovedDetails(originalMapDetails);

        return mapOfRemovedDetails;
    }

    //В светлое время суток фабрика производит детали
    public synchronized void produce() {
        while (isNight) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Exception", e);
            }
        }
        produceDetails();
        String stringOfProducedDetails = mapOfDetails.entrySet().toString();
        logger.info("Detail produced");
        logger.info("Produced details -" + stringOfProducedDetails);
        enableNight();
        logger.info("Night is coming");
        notify();
    }

    public synchronized Map<String, Integer> consume() {
        while (!isNight) {
            try {
                wait();
            } catch (InterruptedException e) {
                logger.log(Level.WARNING, "Exception", e);
            }
        }

        Map<String, Integer> mapOfRemovedDetails = removeDetails();
        logger.info("Details removed");
        disableNight();
        logger.info("Day is coming");
        notify();
        return mapOfRemovedDetails;
    }
}
