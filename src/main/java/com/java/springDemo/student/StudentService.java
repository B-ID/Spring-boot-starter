package com.java.springDemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Bukola",
                        "Idowu",
                        LocalDate.now(),
                        "bukola@gmail.com",
                        72
                ),
                new Student(
                        "Tarman",
                        "David",
                        LocalDate.now(),
                        "tarman@gmail.com",
                        22
                ),
                new Student(
                        "Shola",
                        "Taylor",
                        LocalDate.now(),
                        "shola@gmail.com",
                        42
                )
        );

    }
}
