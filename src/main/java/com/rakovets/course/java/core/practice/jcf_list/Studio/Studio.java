package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.List;

public class Studio {
    private List<Actor> actor;

    public List<Actor> getActor() {
        return actor;
    }

    public Studio(List<Actor> actor) {
        this.actor = actor;
    }

    public void fire() {
        actor.sort(new ActorUpperFeeComparator());
        actor.remove(actor.size() - 1);
    }

}
