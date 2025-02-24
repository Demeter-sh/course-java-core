package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.Studio.ActorUpperFeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.Studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Studio")
public class StudioTest {
    Actor JohnyDepp = new Actor("Johny", "Depp", 10, 10);
    Actor BradPit = new Actor("Brad", "Pitt", 9, 9);
    Actor ColinFarrell = new Actor("Colin", "Farell", 8, 8);
    List<Actor> listOfActor= new ArrayList<>(List.of(JohnyDepp, BradPit, ColinFarrell));
    Studio studio = new Studio(listOfActor);

    @Test
    @DisplayName("Test fire")
    void testFire() {
        List<Actor> expectedListOfActor = new ArrayList<>(List.of(BradPit, ColinFarrell));
        expectedListOfActor.sort(new ActorUpperFeeComparator());
        studio.fire();

        Assertions.assertEquals(expectedListOfActor, studio.getActor());
    }
}
