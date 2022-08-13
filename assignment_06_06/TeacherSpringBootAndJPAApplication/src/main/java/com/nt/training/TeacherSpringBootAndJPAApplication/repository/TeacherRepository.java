package com.nt.training.TeacherSpringBootAndJPAApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.training.TeacherSpringBootAndJPAApplication.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
