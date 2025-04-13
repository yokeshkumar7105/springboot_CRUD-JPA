package com.example.JPAConcepts.service;


import com.example.JPAConcepts.model.Student;
import com.example.JPAConcepts.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void addStudent(Student student) {
        repo.save(student);
    }

    public Student getStudentByRno(int rno) {
        return repo.findById(rno).orElse(new Student());
    }

    public void updateStudent(Student student) {
        repo.save(student);
    }

    public void deleteByRno(int rno) {
        repo.deleteById(rno);
    }

    public void deleteAllStudents() {
        repo.deleteAll();
    }
}
