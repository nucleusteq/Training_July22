package com.nt.training.SpringBootApplication.repository;

import java.util.List;

import com.nt.training.SpringBootApplication.domain.Teacher;

public interface TeacherRepository {

	public List<Teacher> getAllStudent();
	
	public Teacher saveTeacher(Teacher teacher);
	
	public String deleteTeacher(Integer id);
	
	public Teacher updateTeacher(Integer id , Teacher teacher);
	
	public List<Teacher> getTeacherByFirstName(String firstName);

	public List<Teacher> getAllTeacher();
	
}