package com.jpa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	
}