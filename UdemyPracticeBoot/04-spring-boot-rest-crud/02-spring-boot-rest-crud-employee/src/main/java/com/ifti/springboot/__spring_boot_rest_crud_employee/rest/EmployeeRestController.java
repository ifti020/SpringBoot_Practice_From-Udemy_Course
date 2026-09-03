package com.ifti.springboot.__spring_boot_rest_crud_employee.rest;

import com.ifti.springboot.__spring_boot_rest_crud_employee.dao.EmployeeDAO;
import com.ifti.springboot.__spring_boot_rest_crud_employee.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // quick and dirty : inejct employee dao

    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        this.employeeDAO= theEmployeeDAO;
    }

    // expose "/employees" and return a list of employees

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return  employeeDAO.findAll();
    }

}
