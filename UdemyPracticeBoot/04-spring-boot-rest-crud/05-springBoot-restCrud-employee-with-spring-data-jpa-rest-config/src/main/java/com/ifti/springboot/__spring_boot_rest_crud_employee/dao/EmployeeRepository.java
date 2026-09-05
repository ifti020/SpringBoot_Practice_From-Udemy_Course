package com.ifti.springboot.__spring_boot_rest_crud_employee.dao;

import com.ifti.springboot.__spring_boot_rest_crud_employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // thats it ... no need to write any code lOL!

}
