package com.ifti.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice slow bowling for 25 minutes. Now !!! :-  Cricket Coach";
    }
}
