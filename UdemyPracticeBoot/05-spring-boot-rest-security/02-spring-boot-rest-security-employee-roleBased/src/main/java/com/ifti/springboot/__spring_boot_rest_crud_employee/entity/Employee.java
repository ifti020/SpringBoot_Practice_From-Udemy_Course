package com.ifti.springboot.__spring_boot_rest_crud_employee.entity;


import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    //note: entity bananor somoy ei step mone rkahte hobe
    //Step:1 define fields
    //step 2: define constructors
    // step 3: define getter/setter
    // step 4 : define toString
    ////////////////////////////////
    ///
    /// define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firsName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    //2: define constructors
    // constructor a id rakhinai karon  id auto generate hobe
    public Employee(String firsName, String lastName, String email) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
    }


    // define no arg constructor
    public Employee() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
