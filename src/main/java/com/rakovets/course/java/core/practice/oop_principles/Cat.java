package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
    private String name;
    public Cat(String name){
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String mew(Person person) {
        person.changeHappiness(-5);
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public String purr(Person person) {
        person.changeHappiness(5);
    return "purr";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
