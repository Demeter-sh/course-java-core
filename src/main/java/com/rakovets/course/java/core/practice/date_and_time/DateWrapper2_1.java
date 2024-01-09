package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DateWrapper2_1 implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.ge;
    }
}
