package com.ifti.cruddemo.dao;

import com.ifti.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);



    Student findById(Integer id);
}
