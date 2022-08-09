package com.nt.training.TeacherSpringBootApplication.service;

import java.util.List;

import com.nt.training.TeacherSpringBootApplication.model.Teacher;

public interface TeacherService {
	
	public Teacher addTeacher(Teacher teacher);
	
	public List<Teacher> getAllTeachers();
	
	public String removeTeacher(int id);
	
	public String updateTeacher(int id, Teacher teacher);
	
	public Teacher getTeacherFromId(int id);
	
	public List<Teacher> getTeacherFromFirstName(String firstName);
	
	public List<Teacher> getTeacherFromLastName(String lastName);
}
