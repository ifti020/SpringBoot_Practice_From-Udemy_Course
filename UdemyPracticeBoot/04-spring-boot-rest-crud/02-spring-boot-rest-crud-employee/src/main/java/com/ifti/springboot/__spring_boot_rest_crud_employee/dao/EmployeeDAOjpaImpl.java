package com.ifti.springboot.__spring_boot_rest_crud_employee.dao;

import com.ifti.springboot.__spring_boot_rest_crud_employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOjpaImpl implements EmployeeDAO{

    // define field for entity manager
    // set up constructor injection

    // define field for entity manager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public EmployeeDAOjpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {

        // create a query
        // execute query amd get result list
        // return this results/
        /////////////////////

        // create a query
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        // execute query amd get result list
        List<Employee> employees = query.getResultList();

        // return this results
        return employees;



    }
}
