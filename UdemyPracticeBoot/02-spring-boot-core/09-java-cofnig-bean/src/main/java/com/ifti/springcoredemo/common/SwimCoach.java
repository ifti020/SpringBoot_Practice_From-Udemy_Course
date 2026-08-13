package com.ifti.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach ()
    {
        System.out.println("In Constructor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1001 meters as a Warm Up. Now !!! Swim Cocah";

    }
}
