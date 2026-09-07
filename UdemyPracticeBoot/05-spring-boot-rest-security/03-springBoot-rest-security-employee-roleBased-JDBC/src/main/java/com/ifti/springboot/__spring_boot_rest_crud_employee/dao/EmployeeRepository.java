package com.ifti.springboot.__spring_boot_rest_crud_employee.dao;

import com.ifti.springboot.__spring_boot_rest_crud_employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // thats it ... no need to write any code lOL!

}
