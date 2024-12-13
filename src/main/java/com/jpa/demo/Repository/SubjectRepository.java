package com.jpa.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	
}
