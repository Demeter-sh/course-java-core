package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Sudio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.Sudio.LastNameAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.Sudio.LastNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.Sudio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudioTest {
    Actor Johny = new Actor("Johnny", "Depp", 1000000, 59);
    Actor JohnyJ = new Actor("Johnny", "Depp", 1000000, 49);
    Actor Leonardo = new Actor("Leonardo", "DiCaprio", 1500000, 47);
    Actor Charles = new Actor("Charles", "Hunnam", 900000, 42);
    Actor Jensen = new Actor("Jensen", "Ackles", 800000, 44);
    List<Actor> actorArrayList = new ArrayList<Actor>(List.of(Johny, Leonardo, Charles, Jensen));
    static Stream<Arguments> provideArgumentsForFee() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(
                        new Actor("Johnny", "Depp", 1000000, 59),
                        new Actor("Charles", "Hunnam", 900000, 42),
                        new Actor("Jensen", "Ackles", 800000, 44)
                )
                        )
                )
        );
    }

    @ParameterizedTest(name = "TestFee {0}")
    @MethodSource("provideArgumentsForFee")
    @DisplayName("Test fire")
    void fireTest(List<Actor> expected) {
        Studio actualStudio = new Studio();
        actualStudio.fire(actorArrayList);
        List<Actor> actual = actualStudio.getActors();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForLastNameComparator() {
        return Stream.of(Arguments.of( new ArrayList<>(List.of(
                new Actor("Jensen", "Ackles", 800000, 44),
                new Actor("Johnny", "Depp", 1000000, 59),
                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                new Actor("Charles", "Hunnam", 900000, 42)))
            )
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForLastNameComparator")
    @DisplayName("provideArgumentsForLastNameComparator%")
    void lastNameComparatorTest(List<Actor> expected) {
        actorArrayList.sort(new LastNameComparator());
        Assertions.assertEquals(expected, actorArrayList);
    }
}
