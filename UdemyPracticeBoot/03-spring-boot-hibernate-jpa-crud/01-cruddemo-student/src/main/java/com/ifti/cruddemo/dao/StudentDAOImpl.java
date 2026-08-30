package com.ifti.cruddemo.dao;

import com.ifti.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field or entity manager

    private EntityManager entityManager;


    // inject entity manager usinng constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save (Student theStudent)
    {
    entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // step 1 : create a query
                  //note : this is not the name of database table , it is the name of the entity class " Student"
                 // which is mapped to the database table "student"
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student", Student.class);

        // step 2 : return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        // step 1; create a query
        TypedQuery<Student> theQuery = entityManager.createQuery
                ("From Student where lastName =:theData",Student.class);

        // step 2: set query parameter

        theQuery.setParameter("theData", theLastName);

        // step 3: return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);

    }

}
