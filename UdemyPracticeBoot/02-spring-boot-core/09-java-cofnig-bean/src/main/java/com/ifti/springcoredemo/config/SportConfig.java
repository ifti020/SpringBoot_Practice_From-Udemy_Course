package com.ifti.springcoredemo.config;

import com.ifti.springcoredemo.common.Coach;
import com.ifti.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
//    the bean id default to the method name if not specified otherwise. So here the bean id will be "swimCoach"
//    @Bean
    //if we use bean id then we need to use the id inside Qualifier annotation in the DemoController class.
    // If we don't use bean id then we can use the method name inside Qualifier annotation in the DemoController class.

    //use with bean id
    @Bean("kingfisher")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
