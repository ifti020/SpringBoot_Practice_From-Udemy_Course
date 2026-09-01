package com.ifti.demo.rest;

import com.ifti.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

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
        // just index into the list ... keep it simple for now\
        //Check the studentId against list size
        if((studentId >= theStudents.size() || (studentId < 0)))
        {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }


}


