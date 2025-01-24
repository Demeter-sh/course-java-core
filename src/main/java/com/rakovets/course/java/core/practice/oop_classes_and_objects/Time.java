package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Time(int hours, int minutes, int seconds) {
            if (hours > -1 & hours < 25) {
                this.hours = hours;
            } else this.hours = -1;
            if (minutes > -1 & minutes < 61) {
                this.minutes = minutes;
            }
            if (seconds > -1 & seconds <= 60) {
                this.seconds = seconds;
            }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
