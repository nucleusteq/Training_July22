package com.crud.teacher.repository.impl;

import java.util.ArrayList;
import java.util.Iterator;
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




	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teachers;
	}




	@Override
	public String deleteTeacher(Integer id) {
		System.out.println("Teacher id to deleted"+id);
		String t="";
		Iterator<Teacher> iterator = teachers.iterator();
		int index =0;
		for(int i = 0 ; i<teachers.size() ;i++) {
			Teacher teacher = teachers.get(i);
			if(teacher.getId() == id) {
				index = i;
			}
		}
		teachers.remove(index);
		t = "student deleted";
		
		return t;
	}




	@Override
	public Teacher updateTeacher(Integer id, Teacher teacher) {
		for(Teacher t : teachers) {
			if(t.getId() == id) {
				t.setTeacher_name(teacher.getTeacher_name());
				t.setSubject(teacher.getSubject());
				t.setId(id);
			}
		}
		return teacher;
	}
	
	

}
