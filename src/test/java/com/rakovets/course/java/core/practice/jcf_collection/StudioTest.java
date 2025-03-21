package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_list.Studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.Studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudioTest {
    Studio studio = new Studio();

    static Stream<Arguments> provideArgumentsForFine() {
        return Stream.of(Arguments.of(new ArrayList<>(List.of(new Actor("James", "Bond", 20, 20),
                new Actor("Johny", "Depp", 15, 22),
                new Actor("Jacky", "Chan", 10, 19),
                new Actor("Jason", "Statham",25,19))),
                new ArrayList<>(List.of(new Actor("Jacky", "Chan", 10, 19),
                new Actor("Johny", "Depp", 15, 22),
                new Actor("James", "Bond", 20, 20)))));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFine")
    public void fineTest (List<Actor> actual, List<Actor> expected) {
        studio.fire(actual);
        Assertions.assertEquals(actual, expected);
    }
}
