package com.ifti.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice slow bowling for 25 minutes. Now !!! :-  Cricket Coach";
    }
}
