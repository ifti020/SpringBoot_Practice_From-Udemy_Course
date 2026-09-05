package com.ifti.springboot.__spring_boot_rest_crud_employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println("the api is:   http://localhost:8080/magic-api/members" );
	}

}
