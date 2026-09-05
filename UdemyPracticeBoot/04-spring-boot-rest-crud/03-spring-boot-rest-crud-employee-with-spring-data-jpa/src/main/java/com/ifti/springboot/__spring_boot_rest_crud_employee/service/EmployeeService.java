package com.ifti.springboot.__spring_boot_rest_crud_employee.service;

import com.ifti.springboot.__spring_boot_rest_crud_employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
