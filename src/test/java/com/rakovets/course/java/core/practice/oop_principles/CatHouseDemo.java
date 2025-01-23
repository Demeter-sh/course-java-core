package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Persian;
import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Siamese;

public class CatHouseDemo {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Persian persian = new Persian("Flint");
        Siamese siameseSmoke = new Siamese("Smoke");
        System.out.println("get persian percent meow " +persian.getPercentMew()
                + " persian get percent purr " + persian.getPercentPurr());
        System.out.println("Person1 happiness before persian cat purrs " + person1.getHappiness());

        persian.purr(person1);
        System.out.println("Person1 happiness after persian cat purrs " + person1.getHappiness());

        persian.mew(person1);
        System.out.println("Person1 happiness after persian cat mews " + person1.getHappiness());

        System.out.println("get siamese percent meow " + siameseSmoke.getPercentMew()
                + " get siamese percent purr " + siameseSmoke.getPercentPurr());

        siameseSmoke.purr(person2);
        System.out.println("Person2 happiness after siamese purrs " + person2.getHappiness());
    }
}
