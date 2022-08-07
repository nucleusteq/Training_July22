package com.nt.training.SpringBootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.training.SpringBootApp.domain.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
