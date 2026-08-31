package com.ifti.demo.rest;

import com.ifti.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define endpoint for "/student " - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents(){
        List <Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Ifti","Haque"));
        theStudents.add(new Student("Parama","Farhat"));
        theStudents.add(new Student("Ifsa","Haque"));
        return theStudents;

    }
}
