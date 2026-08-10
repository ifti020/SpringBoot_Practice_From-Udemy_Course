package com.ifti.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(String name) {
        return "Practice Slow Bowling for 20 minutes " + name+ " ";
    }
}
