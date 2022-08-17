package com.nt.training.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.training.SpringBootApplication.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
