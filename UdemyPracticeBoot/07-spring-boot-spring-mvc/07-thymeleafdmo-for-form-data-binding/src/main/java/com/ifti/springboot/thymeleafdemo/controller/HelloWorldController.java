package com.ifti.springboot.thymeleafdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloWorldController {


    // step 1 : need a controller method to show initial HTML form
    // step 2 : need a controller method to process the HTML

    @GetMapping("/showForm")
    public String showForm ()
    {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }

    // 04 -mvc-hellowrold
    // step 1 : need a controller method to read form data and
    // step 2 : add data to the model

    @RequestMapping("/processFormV2")
    public String letsShoutDube(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        // convert the data to all caps
        // create the message
        // add message to the model

        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "YO! " + theName;
        model.addAttribute("message", result);

        return "helloworld";

    }

        // add @RequestParam for our controller
        @PostMapping("/processFormV3")
        public String processFormV3(@RequestParam("studentName") String theName, Model model) {

            theName = theName.toUpperCase();
            String result = "Hey My Friend from @RequesrParam v3! " + theName;
            model.addAttribute("message", result);

            return "helloworld";
        }
}
