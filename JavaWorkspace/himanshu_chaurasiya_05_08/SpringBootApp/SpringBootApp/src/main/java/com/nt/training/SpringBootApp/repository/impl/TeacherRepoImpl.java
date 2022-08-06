package com.nt.training.SpringBootApp.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.training.SpringBootApp.domain.Teacher;
import com.nt.training.SpringBootApp.repository.TeacherRepo;


@Repository
public class TeacherRepoImpl implements TeacherRepo{

	static List<Teacher> teachers;
	

	public TeacherRepoImpl() {
		teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher(1,"hari","om"));
		teachers.add(new Teacher(2,"guru","prasad"));
		teachers.add(new Teacher(3,"maha","kal"));
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teachers;
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		teachers.add(teacher);
		return teacher;
	}

	@Override
	public String removeTeacher(Integer id) {
		int i=0;
		String def="Id not found";
		while  (teachers.size()>i) {
			Teacher teach  = teachers.get(i);
			if (id == teach.getTeachId()) {
				teachers.remove(i);
				def="Teacher removed";
				break;
			}
			i++;
		}
		return def;
	}

	@Override
	public String updateTeacher(Integer id, Teacher teach_obj) {
		int i=0;
		String def="Id not found";
		while  (teachers.size()>i) {
			Teacher tea  = teachers.get(i);
			if (id == tea.getTeachId()) {
				tea.setTeachFirstName(teach_obj.getTeachFirstName());
				tea.setTeachId(teach_obj.getTeachId());
				tea.setTeachLastName(teach_obj.getTeachLastName());
				def="Teacher updated";
				break;
			}
			i++;
		}
		return def;
	}

	@Override
	public List<Teacher> getByName(String inputName) {
		List<Teacher> teachObj = new ArrayList<Teacher>();
		int i=0;
		while  (teachers.size()>i) {
			Teacher teach_name  = teachers.get(i);
			if ( (inputName.equals(teach_name.getTeachFirstName())) || (inputName.equals(teach_name.getTeachLastName())) ) 
			{
				teachObj.add(teach_name);	
			}
			i++;
		}
		return teachObj ;
	}
}
