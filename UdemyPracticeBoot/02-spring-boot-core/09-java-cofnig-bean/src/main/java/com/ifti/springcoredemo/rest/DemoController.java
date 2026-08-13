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

       @Autowired
       public  DemoController(
               // beand id  is kingfisher
               // because we set this bean id in the SportConfig class using @Bean("kingfisher")
               @Qualifier("kingfisher") Coach theCoach)

       {
           System.out.println("In Constructor : " + getClass().getSimpleName());
           myCoach = theCoach;

       }

             @GetMapping("/dailyworkout")
                 public String getDailyWorkout()
                     {
                         return myCoach.getDailyWorkout();
                             }



}
