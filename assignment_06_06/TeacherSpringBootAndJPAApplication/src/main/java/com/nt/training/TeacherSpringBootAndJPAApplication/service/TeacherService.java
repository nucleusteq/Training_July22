package com.nt.training.TeacherSpringBootAndJPAApplication.service;

import java.util.List;

import com.nt.training.TeacherSpringBootAndJPAApplication.entity.Teacher;



public interface TeacherService {
	
    public Teacher addTeacher(Teacher teacher);
	
	public List<Teacher> getAllTeachers();
	
	public String removeTeacherById(int id);
	
	public Teacher updateTeacher(Teacher teacher);
	
	public Teacher getTeacherFromId(int id);
	
	public List<Teacher> getTeacherFromFirstName(String firstName);

	public List<Teacher> getTeacherFromLastName(String lastName);
}
