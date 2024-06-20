package com.java.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    //POST OPERATION
    Student save(Student s);

    //GET OPERATION
    List<Student> findAllStudents();

    //GET OPERATION
    Student findByEmail(String email);

    Student update(Student s);

    //DELETE OPERATION
    void delete(String email);
}
