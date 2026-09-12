package com.ifti.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {


    // step 1 : need a controller method to show initial HTML form
    // step 2 : need a controller method to process the HTML

    @RequestMapping("/showForm")
    public String showForm ()
    {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }
}
