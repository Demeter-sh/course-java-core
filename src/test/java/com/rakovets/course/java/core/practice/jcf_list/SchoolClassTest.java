package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Class.Person;
import com.rakovets.course.java.core.practice.jcf_list.Class.PersonAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.Class.SchoolClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("SchoolClass")
public class SchoolClassTest {
    Person dmitryRac = new Person("Dmitry", "Rac", 7, 7);
    Person ivanIvanov = new Person("Ivan", "Ivanov", 8 , 8);
    Person alexBreznev = new Person("Alex", "Breznev", 9, 9);
    List<Person> personList = new ArrayList<>(List.of(dmitryRac, alexBreznev, ivanIvanov));
    SchoolClass schoolClass = new SchoolClass(personList);

    @Test
    @DisplayName("Get best student")
    void getBestStudentTest() {
        Assertions.assertEquals(alexBreznev, schoolClass.getBestStudent());
    }

    @Test
    @DisplayName("Person age comparator")
    void testPersonAgeComparator() {
        personList.sort(new PersonAgeComparator());
        Assertions.assertEquals(alexBreznev, personList.get(personList.size() - 1));
    }
}
