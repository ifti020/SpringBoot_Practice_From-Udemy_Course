package com.ifti.springcoredemo.rest;

import com.ifti.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController

    public class DemoController {
    // Define a private filed for the dependency \
         private Coach myCoach;
         private Coach anotherCoach;


       @Autowired

       public  DemoController(
               @Qualifier("cricketCoach") Coach theCoach,
               @Qualifier("cricketCoach") Coach theAnotherCoach)

       {
           System.out.println("In Constructor : " + getClass().getSimpleName());
           myCoach = theCoach;
           anotherCoach = theAnotherCoach;
       }

             @GetMapping("/dailyworkout")
                 public String getDailyWorkout()
                     {
                         return myCoach.getDailyWorkout();
                             }

              @GetMapping("/check")
               public String check()
              {

                return "comapare beans : myCoach == anotherCoach,  " + (myCoach == anotherCoach);

                  }

}
