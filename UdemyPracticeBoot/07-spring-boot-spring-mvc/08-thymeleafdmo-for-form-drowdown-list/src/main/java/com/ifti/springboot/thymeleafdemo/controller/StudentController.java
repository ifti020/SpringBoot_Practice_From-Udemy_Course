package com.ifti.springboot.thymeleafdemo.controller;

import com.ifti.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController  {

    // new added : get countires from applicaiton.propertites
    @Value("${countries}")
    private List<String> countries;


    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        // step 1 : create a new student object
        // step 2: add student to the model

        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);

        // new added : get countires from applicaiton.propertites
        // add the list of countries to the model
        theModel.addAttribute("countries", countries);

        return "student-form";
       

    }
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent)
    {
        System.out.println("theStudent: "+ theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }


}
