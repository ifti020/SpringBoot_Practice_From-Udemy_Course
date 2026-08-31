package com.ifti.demo.rest;

import com.ifti.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List <Student> theStudents;

    // define @PostConstruct to load the student data ... only onece!

    @PostConstruct
    public void loadData()
    {
         theStudents = new ArrayList<>();
        theStudents.add(new Student("Ifti","Haque"));
        theStudents.add(new Student("Parama","Farhat"));
        theStudents.add(new Student("Ifsa","Haque"));

    }

    // define endpoint for "/student " - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;

    }

    // define endpoint or "/students/{studentId}"  - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {

        // just index into the list ... keep it simple for now

        return theStudents.get(studentId);
    }
}
