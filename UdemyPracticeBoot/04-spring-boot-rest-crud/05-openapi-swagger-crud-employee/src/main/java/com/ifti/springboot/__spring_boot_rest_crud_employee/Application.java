package com.ifti.springboot.__spring_boot_rest_crud_employee;

import jakarta.xml.bind.SchemaOutputResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Run this Custom Path: "+"http://localhost:8080/swagger-ui/index.html");
		System.out.println("Note: Or check applicaiton.properties if any Custom Path");
	}

}