package com.crud.teacher.repository;

import java.util.List;

import com.crud.teacher.domain.Teacher;

public interface TeacherRepository {
public Teacher saveTeacher(Teacher Teacher);
public List<Teacher> getAllTeacher();
public String deleteTeacher(Integer id);
public Teacher updateTeacher(Integer id, Teacher teacher);
}
