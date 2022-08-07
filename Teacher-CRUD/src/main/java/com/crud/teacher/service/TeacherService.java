package com.crud.teacher.service;

import org.springframework.stereotype.Service;

import com.crud.teacher.domain.Teacher;

@Service
public interface TeacherService {
public Teacher saveTeacher(Teacher teacher);
}
