package com.rakovets.course.java.core.practice.jcf_list.Sudio;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private List<Actor> actors;

    public List<Actor> getActors() {
        return actors;
    }

    public void fire(List<Actor> actorsList) {
        actorsList.sort(new FeeComparator());
        actorsList.remove(0);
        actors = new ArrayList<>(actorsList);

    }
}
