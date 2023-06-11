package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Cat {
    private String name;
    Cat (String name){
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
