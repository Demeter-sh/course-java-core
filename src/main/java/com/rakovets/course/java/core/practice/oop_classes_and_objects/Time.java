package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Time {
int hours;
int minutes;
int seconds;
int totalSeconds;
final int SECONDS_IN_MINUTES = 60;
final int SECONDS_IN_HOURS = 3600;

Time(int totalSeconds) {
    this.totalSeconds = totalSeconds;
    this.hours = totalSeconds / SECONDS_IN_HOURS;
    totalSeconds -= getHours() * SECONDS_IN_HOURS;
    this.minutes = totalSeconds / SECONDS_IN_MINUTES;
    totalSeconds -= getMinutes() * SECONDS_IN_MINUTES;
    this.seconds = totalSeconds;
}

Time(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;


}

public int getHours() {
    return this.hours;
}

public void setHours(int hours) {
    this.hours = hours;
}

public  int getMinutes() {
    return this.minutes;
}

public void setMinutes(int minutes) {
    this.minutes = minutes;
}

public int getSeconds() {
    return this.seconds;
}

public void setSeconds(int seconds) {
    this.seconds = seconds;
}

public int getTotalSeconds() {
    int totalSeconds = hours * SECONDS_IN_HOURS + minutes * SECONDS_IN_MINUTES + seconds;
    return this.totalSeconds = totalSeconds;
}
}
