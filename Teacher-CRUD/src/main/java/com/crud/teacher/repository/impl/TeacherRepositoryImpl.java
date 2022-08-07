package com.crud.teacher.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.crud.teacher.domain.Teacher;
import com.crud.teacher.repository.TeacherRepository;


@Repository
public class TeacherRepositoryImpl implements TeacherRepository{

	static List<Teacher> teachers;
	
	public TeacherRepositoryImpl() {
		teachers= new ArrayList<Teacher>();
		
		teachers.add(new Teacher(1,"Vanshika","Java"));
		teachers.add(new Teacher(2,"Ankita","Python"));
		teachers.add(new Teacher(3,"Jaya","PHP"));
	}
	

	
	
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		teachers.add(teacher);
		return teacher;
	}
	
	

}
