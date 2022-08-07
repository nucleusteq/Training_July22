package com.SpringTeacher.SpringTeacher.services;

import java.util.List;

import com.SpringTeacher.SpringTeacher.entities.Teacher;

public interface TeacherService {

	public List<Teacher> getTeachers();
	public Teacher getTeacher(long teacherId);
	public Teacher addTeacher(Teacher teacher);
	//public Teacher updateTeacher(Teacher teacher);
	//public Teacher deleteTeacher(long teacherId);
	
}
