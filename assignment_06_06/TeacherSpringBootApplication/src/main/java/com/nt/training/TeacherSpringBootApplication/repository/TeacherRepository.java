package com.nt.training.TeacherSpringBootApplication.repository;

import java.util.List;

import com.nt.training.TeacherSpringBootApplication.model.Teacher;

public interface TeacherRepository {
	//method to add a new teacher
	public Teacher addTeacher(Teacher teacher);
	
	//method to display all teachers
	public List<Teacher> getAllTeachers();
	
	//method to remove teacher
	public String removeTeacher(int id);
	
	//method to update teacher
	public String updateTeacher(int id,Teacher teacher);
	
	//method to get teacher from id
	public Teacher getTeacherFromId(int id);
	
	//method to get teacher from firstName
	public List<Teacher> getTeacherFromFirstName(String firstName);
	
	//method to get teacher from lastName
	public List<Teacher> getTeacherFromLastName(String lastName);
}	
