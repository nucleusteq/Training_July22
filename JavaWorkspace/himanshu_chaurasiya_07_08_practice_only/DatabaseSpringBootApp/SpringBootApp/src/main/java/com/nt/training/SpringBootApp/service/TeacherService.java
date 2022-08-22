package com.nt.training.SpringBootApp.service;

import java.util.List;

import com.nt.training.SpringBootApp.domain.Teacher;

public interface TeacherService {

	public List<Teacher> getAllTeacher();

	public Teacher addTeacher(Teacher teacher);

	public String removeTeacher(Integer id);
	
//	
//	public Teacher updateTeacher(Integer id , Teacher teach);
//	
//	public List<Teacher> getByName(String teachName);
	
	
	
}
