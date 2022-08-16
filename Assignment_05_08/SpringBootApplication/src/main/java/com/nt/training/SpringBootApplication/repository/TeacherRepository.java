package com.nt.training.SpringBootApplication.repository;

import java.util.List;

import com.nt.training.SpringBootApplication.domain.Teacher;

public interface TeacherRepository {
	//method to add a new teacher

	public Teacher getTeacherFromId(int id);
	public List<Teacher> getTeacherFromFirstName(String firstName);
	public List<Teacher> getTeacherFromLastName(String lastName);
	public Teacher addTeacher(Teacher teacher);
	public List<Teacher> getAllTeachers();
	public String removeTeacher(int id);
	public String updateTeacher(int id,Teacher teacher);
}