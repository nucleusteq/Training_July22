package com.crud.teacher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.teacher.domain.Teacher;

@Service
public interface TeacherService {
public Teacher saveTeacher(Teacher teacher);
public List<Teacher> getAllTeacher();
public String deleteTeacher(Integer id);
public Teacher updateTeacher(Integer id, Teacher teacher);
}
