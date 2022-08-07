package com.nt.training.SpringBootApplication.service;

import java.util.List;

import com.nt.training.SpringBootApplication.domain.Teacher;

public interface TeacherService {

	public List<Teacher> getAllTeacher();
	public Teacher saveTeacher(Teacher teacher) ;
	public String deleteTeacher(Integer id);
	public Teacher updateTeacher(Integer id, Teacher teacher);
	public List<Teacher> getTeacherByFirstName(String firstName);
	
}