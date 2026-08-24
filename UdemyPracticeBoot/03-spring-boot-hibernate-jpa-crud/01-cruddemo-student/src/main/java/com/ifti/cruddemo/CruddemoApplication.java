package com.ifti.cruddemo;

import com.ifti.cruddemo.dao.StudentDAO;
import com.ifti.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner ->
		{
//			createStudent(studentDAO);
			createMultipeStudents(studentDAO);
		};

	}

	private void createMultipeStudents(StudentDAO studentDAO) {
		//create multiple studnets
		System.out.println("Creating new 3 student object ...");
		Student tempStudent1 = new Student("Shohan", "Viya", "shohan@gmail.com");
		Student tempStudent2 = new Student("Shomik", "Viya", "shomik@gmail.com");
		Student tempStudent3 = new Student("Asif", "Iqbal", "asif@gmail.com");
		//save this studnet obnjects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("ifti", "Haque", "ifti1@gmail.com");
		// save the studnet object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// diaplay id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());


	}


}
