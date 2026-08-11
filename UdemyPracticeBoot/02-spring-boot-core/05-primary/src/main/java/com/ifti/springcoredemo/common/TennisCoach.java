package com.ifti.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Spend 40 minutes on tennis practice. Now !!! Tennis Coach";
    }
}
