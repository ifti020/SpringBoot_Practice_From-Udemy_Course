package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World From Ifti Haque! <br>" +
                "Pray for me. I'm working hard to become a Spring Boot Developer.";
    }

}
