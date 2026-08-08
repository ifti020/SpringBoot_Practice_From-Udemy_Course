package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    // inject properties for : coach.name and team.name
    @Value("${coach.name}")
    private  String coachName;
    @Value("${team.name}")
    private String teamName;

// expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    // expose "/" return "Hello world"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World From Ifti Haque! <br>" +
                "Pray for me. I'm working hard to become a Spring Boot Developer.";
    }

    // exponse a new enfpoint for "workout"
    @GetMapping("/workout")
   public String getDailyWorkout(){
        return "Run a hard 5k";
    }

 //  expose a new encpoint for "fortune"
       @GetMapping("/fortune")
    public String gerDailyFortune(){
        return "Today is My Lucky day!";
       }



}
