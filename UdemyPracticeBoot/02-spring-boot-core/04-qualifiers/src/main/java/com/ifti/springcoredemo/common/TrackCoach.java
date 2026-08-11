package com.ifti.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes on track practice. Now !!! Track Coach";
    }
}
