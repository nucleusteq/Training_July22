package com.nt.training.SpringBootApplication.repository.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.repository.TeacherRepository;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository{

	static List<Teacher> teachers;
	
	public TeacherRepositoryImpl() {
		teachers = new ArrayList<Teacher>();
		
		teachers.add(new Teacher(1, "MR." ,"Manohar"));
		teachers.add(new Teacher(2, "Mrs." ,"Briganza"));
		teachers.add(new Teacher(3, "Dr." ,"Kalam"));
	}
	
	@Override
	public List<Teacher> getAllTeacher() {
		
		return teachers;
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		teachers.add(teacher);
		return teacher;
	}

	@Override
	public String deleteTeacher(Integer id) {
		System.out.println("Student id to deleted"+id);
		String s="";
		Iterator<Teacher> iterator = teachers.iterator();
		int index =0;
		for(int i = 0 ; i<teachers.size() ;i++) {
			Teacher teacher = teachers.get(i);
			if(teacher.getId() == id) {
				index = i;
			}
		}
		teachers.remove(index);
		s = "teacher deleted";
		
		return s;
	}

	@Override
	public Teacher updateTeacher(Integer id, Teacher teacher) {

		for(Teacher s : teachers) {
			if(s.getId() == id) {
				s.setFirstName(teacher.getFirstName());
				s.setLastName(teacher.getLastName());
				s.setId(id);
			}
		}
		return teacher;
	}

	@Override
	public List<Teacher> getTeacherByFirstName(String firstName) {
		List<Teacher> filterTeacher  = new ArrayList<Teacher>();
		for(Teacher teacher:teachers) {
			if(teacher.getFirstName().equals(firstName)) {
				filterTeacher.add(teacher);
			}
		}
		
		
		return filterTeacher;
	}

	
	
}