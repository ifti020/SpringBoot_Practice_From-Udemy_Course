package com.ifti.springcoredemo;

import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice First Bowling & practice first time create spring core";
    }
}
