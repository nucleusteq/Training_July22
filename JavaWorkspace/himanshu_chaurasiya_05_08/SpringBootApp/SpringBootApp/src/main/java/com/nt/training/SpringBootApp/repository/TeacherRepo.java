package com.nt.training.SpringBootApp.repository;

import java.util.List;

import com.nt.training.SpringBootApp.domain.Teacher;

public interface TeacherRepo {

	public List<Teacher> getAllTeacher();

	public Teacher addTeacher(Teacher teacher);
	
	public String removeTeacher(Integer id);
	
	public String updateTeacher(Integer id , Teacher teach);
	
	public List<Teacher> getByName(String teachName);
}
