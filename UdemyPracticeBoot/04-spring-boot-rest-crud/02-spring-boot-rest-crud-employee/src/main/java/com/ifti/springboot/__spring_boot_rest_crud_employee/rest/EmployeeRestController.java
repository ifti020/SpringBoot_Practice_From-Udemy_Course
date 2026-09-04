package com.ifti.springboot.__spring_boot_rest_crud_employee.rest;

import com.ifti.springboot.__spring_boot_rest_crud_employee.entity.Employee;
import com.ifti.springboot.__spring_boot_rest_crud_employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // quick and dirty : inejct employee dao

    public EmployeeRestController(EmployeeService theEmployeeService){
        this.employeeService= theEmployeeService;
    }

    // expose "/employees" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return  employeeService.findAll();
    }

}
