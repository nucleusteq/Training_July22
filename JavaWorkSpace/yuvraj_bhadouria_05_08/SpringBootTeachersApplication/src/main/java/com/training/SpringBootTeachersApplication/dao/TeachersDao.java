package com.training.SpringBootTeachersApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.SpringBootTeachersApplication.domain.Teacher;

public interface TeachersDao extends JpaRepository<Teacher, Integer> {

}
