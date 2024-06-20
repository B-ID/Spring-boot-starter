package com.java.springDemo.student;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {

    //? Field injection (injecting a bean into a class)
//    @Autowired
//    private StudentService service;

    private final StudentService service;

    //? Constructor Injection (Recommended)
    public studentController(StudentService service) {
        this.service = service;

    }


    @PostMapping
    public  Student save(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
        return service.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(
       @RequestBody Student student
    ) {
        return service.update(student);
    }


    @DeleteMapping("/{email}")
    public void delete(
           @PathVariable("email") String email
    ) {
        service.delete(email);
    }



}
