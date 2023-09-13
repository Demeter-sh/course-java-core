package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.Person;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.SchoolClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class SchoolClassTest {
Person person0 = new Person("John", "Smith", 7, 5);
Person person1 = new Person("Dmitry", "Sharshukov", 8, 9);
Person person2 = new Person("Alexandr", "Belov", 10, 8);
Person person3 = new Person("Sergey", "List", 12, 6);
List<Person> personList = new ArrayList<Person>(List.of(person0, person1, person2, person3));

static Stream<Arguments> getArgumentsForgetBestStudent() {
    return Stream.of(Arguments.of( new ArrayList<>(List.of(
            new Person("John", "Smith", 7, 5),
            new Person("Sergey", "List", 12, 6),
            new Person("Alexandr", "Belov", 10, 8),
            new Person("Dmitry", "Sharshukov", 8, 9)
            ))
    ));
}

    @ParameterizedTest(name = "actual{0}")
    @MethodSource("getArgumentsForgetBestStudent")
    @DisplayName("getBestStudentTest")
    void getBestStudentTest(List<Person> expected) {
        SchoolClass schoolClass = new SchoolClass();

        Assertions.assertEquals(expected, schoolClass.getBestStudent(personList));
    }
}
