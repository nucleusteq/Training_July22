package com.nt.training.TeacherSpringBootApplication.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.training.TeacherSpringBootApplication.model.Teacher;
import com.nt.training.TeacherSpringBootApplication.repository.TeacherRepository;

@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

	private static List<Teacher> teachers;
	public TeacherRepositoryImpl() {
		teachers=new ArrayList<Teacher>();
		teachers.add(new Teacher(101,"Himanshu","Dhoke","1234567890"));
	}
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		teachers.add(teacher);
		return teacher;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teachers;
	}

	@Override
	public String removeTeacher(int id) {
		int index=-1;
		for(int i=0;i<teachers.size();i++) {
			if(teachers.get(i).getId() == id) {
				index=i;
			}
		}
		if(index>=0) {
			teachers.remove(index);
			return "Teacher removed successfully";
		}
		
		return "Teacher with the given id does not exist";
	}

	@Override
	public String updateTeacher(int id,Teacher teacher) {
		System.out.println(id +" "+teacher);
		boolean flag=false;
		for(int i=0;i<teachers.size();i++) {
			System.out.println(id+" "+teachers.get(i).getId()+" "+(teachers.get(i).getId() == id));
			if(teachers.get(i).getId() == id) {
				System.out.println(i);
				Teacher t=teachers.get(i);
				t.setFirstName(teacher.getFirstName());
				t.setLastName(teacher.getLastName());
				t.setContactNumber(teacher.getContactNumber());
				flag=true;
			}
		}
		if(!flag) {
			return "Teacher with the given id does not exist";
		}
		return "Teacher updated successfully";
	}

	@Override
	public Teacher getTeacherFromId(int id) {
		for(Teacher teacher:teachers) {
			if(teacher.getId() ==  id) {
				return teacher;
			}
		}
		return null;
	}

	@Override
	public List<Teacher> getTeacherFromFirstName(String firstName) {
		ArrayList<Teacher> teachersWithFirstName=new ArrayList<Teacher>();
		for(Teacher teacher:teachers) {
			if(teacher.getFirstName().equalsIgnoreCase(firstName)) {
				teachersWithFirstName.add(teacher);
			}
		}
		return teachersWithFirstName;
	}
	
	@Override
	public List<Teacher> getTeacherFromLastName(String lastName) {
		ArrayList<Teacher> teachersWithLastName=new ArrayList<Teacher>();
		for(Teacher teacher:teachers) {
			System.out.println(teacher);
			if(teacher.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(teacher);
				teachersWithLastName.add(teacher);
			}
		}
		return teachersWithLastName;
	}

}
