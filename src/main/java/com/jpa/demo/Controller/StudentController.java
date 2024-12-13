package com.jpa.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.Entity.Student;
import com.jpa.demo.Services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	 @Autowired
	    private StudentService studentService;

	    @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        return ResponseEntity.ok(studentService.saveStudent(student));
	    }

	    @GetMapping
	    public ResponseEntity<List<Student>> getAllStudents() {
	        return ResponseEntity.ok(studentService.getAllStudents());
	    }

}
