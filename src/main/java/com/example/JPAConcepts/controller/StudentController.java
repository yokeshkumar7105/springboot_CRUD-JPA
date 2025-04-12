package com.example.JPAConcepts.controller;


import com.example.JPAConcepts.model.Student;
import com.example.JPAConcepts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;


    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rno){
        return service.getStudentByRno(rno);
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        service.addStudent(student);
        return "Added!";
    }





}
