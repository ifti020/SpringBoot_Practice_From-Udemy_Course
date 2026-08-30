package com.ifti.cruddemo;

import com.ifti.cruddemo.dao.StudentDAO;
import com.ifti.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
import java.util.List;

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
//			createMultipeStudents(studentDAO);

//			readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			queryForStudentsByLastName(studentDAO);

			updateStudent(studentDAO);
		};

	}

	private void updateStudent(StudentDAO studentDAO) {
		//Step1 : retrive student based on the id : primary key
		// step 2: change first name to "ARKO"
		// step 3: update the student
		// step 4: display the updated student
		//////////////////////////

		//Step1 : retrive student based on the id : primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// step 2: change first name to "Arko"
		System.out.println("Updating student ...");
		myStudent.setFirstName("Arko");

		// step 3: update the student
		studentDAO.update(myStudent);

		// step 4: display the updated student
		System.out.println("Updated student: " + myStudent);

	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// step 1 : get a list of students
		List <Student> theStudents = studentDAO.findByLastName("Viya");

		// step 2 : display list of students
		for (Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		//step 1 : get a list of students
		List<Student> theStudents = studentDAO.findAll();
		//step 2 : dislay list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// how to read data using hibernate
		// step 1 : create a student object
		// step 2 : save the student object
		// step 3 : display the id of the saved student
		// step 4 : retrieve student based on the id : primary key
		// step 5 : display student

		///////////////////////////////////////
		//start here
		// step 1 : create a student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Tahim", "Mostafiz", "tahim@gmail.com");

		// step 2 : save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// step 3 : display the id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// step 4 : retrieve student based on the id : primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// step 5 : display student
		System.out.println("Found the student: " + myStudent);
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
