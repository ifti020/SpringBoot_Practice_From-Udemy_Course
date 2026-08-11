package com.ifti.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice slow bowling for 25 minutes. Now !!! :-  Cricket Coach";
    }
}
