package com.jpa.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.Entity.Student;
import com.jpa.demo.Entity.Subject;
import com.jpa.demo.Repository.StudentRepository;
import com.jpa.demo.Repository.SubjectRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}




