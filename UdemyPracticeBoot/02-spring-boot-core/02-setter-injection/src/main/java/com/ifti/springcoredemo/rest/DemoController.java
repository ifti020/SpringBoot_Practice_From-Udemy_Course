package com.ifti.springcoredemo.rest;

import com.ifti.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController

    public class DemoController {
    // Define a private filed for the dependency \
         private Coach myCoach;

       @Autowired
       public void setCoach(Coach theCoach)
       //we can set any name for the method, it is not necessary to be setCoach,
       // but it is a good practice to use set + name of the class
       {
           myCoach = theCoach;
       }

             @GetMapping("/dailyworkout")
                 public String getDailyWorkout()
                     {
                         return myCoach.getDailyWorkout();
                             }

}
