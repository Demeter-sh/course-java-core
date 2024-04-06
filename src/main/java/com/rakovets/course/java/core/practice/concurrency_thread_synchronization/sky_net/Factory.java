package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<String, Integer> mapOfProducedDetails;

    public Factory() {
        mapOfProducedDetails = new HashMap<>();
        mapOfProducedDetails.put("Head", 0);
        mapOfProducedDetails.put("Torso", 0);
        mapOfProducedDetails.put("Hand", 0);
        mapOfProducedDetails.put("Feet", 0);
    }

    synchronized void produce() {
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    mapOfProducedDetails.put(("Head"), mapOfProducedDetails.get("Head") + 1);
                    break;
                case 1:
                    mapOfProducedDetails.put("Torso", mapOfProducedDetails.get("Torso")  + 1);
                    break;
                case 2:
                    mapOfProducedDetails.put("Hand", mapOfProducedDetails.get("Hand")  + 1);
                    break;
                case 3:
                    mapOfProducedDetails.put("Feet", mapOfProducedDetails.get("Feet")  + 1);
                    break;
            }
        }

        for (Map.Entry<String, Integer> mapEntry: mapOfProducedDetails.entrySet()) {
            System.out.printf("Produced: Detail - %s, quantity - %d\n", mapEntry.getKey(), mapEntry.getValue());
        }
    }

    synchronized Map<String, Integer> removeDetails() {
        Map<String, Integer> mapOfRemovedDetails = new HashMap<>();
        for (int i = 0; i < 5; i ++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    if (mapOfProducedDetails.get("Head") > 0) {
                        mapOfProducedDetails.put(("Head"), mapOfProducedDetails.get("Head") - 1);
                        mapOfRemovedDetails.put(("Head"), mapOfRemovedDetails.getOrDefault("Head", 0) + 1);
                    }
                    break;
                case 1:
                    if (mapOfProducedDetails.get("Torso") > 0) {
                        mapOfProducedDetails.put("Torso", mapOfProducedDetails.get("Torso") - 1);
                        mapOfRemovedDetails.put(("Torso"), mapOfRemovedDetails.getOrDefault("Torso", 0) + 1);
                    }
                    break;
                case 2:
                    if (mapOfProducedDetails.get("Hand") > 0) {
                        mapOfProducedDetails.put("Hand", mapOfProducedDetails.get("Hand") - 1);
                        mapOfRemovedDetails.put(("Hand"), mapOfRemovedDetails.getOrDefault("Hand", 0) + 1);
                    }
                    break;
                case 3:
                    if (mapOfProducedDetails.get("Feet") > 0) {
                    mapOfProducedDetails.put("Feet", mapOfProducedDetails.get("Feet")  - 1);
                    mapOfRemovedDetails.put(("Feet"),mapOfRemovedDetails.getOrDefault("Feet", 0) + 1);
                    }
                    break;
            }
        }

        for (Map.Entry<String, Integer> mapEntry: mapOfRemovedDetails.entrySet()) {
            System.out.printf("Removed: Detail - %s, quantity - %d\n", mapEntry.getKey(), mapEntry.getValue());
        }

        return mapOfRemovedDetails;
    }
}
