package com.ifti.springcoredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;
    public DemoRestController(Coach theCoach) {
        this.myCoach = theCoach;
    }

    //call with name 
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        String name = "IFTI HAQUE";
        return myCoach.getDailyWorkout(name);

    }
}
