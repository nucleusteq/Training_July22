package com.nt.training.SpringBootApplication.repository.impl;

import java.util.*;
import org.springframework.stereotype.Repository;

import com.nt.training.SpringBootApplication.domain.Student;
import com.nt.training.SpringBootApplication.domain.TeacherDomain;
import com.nt.training.SpringBootApplication.repository.TeacherRepository;

@Repository
public class TeacherRepositroyImpl implements TeacherRepository{
	
	 static List<TeacherDomain> teachers;
	 
	 public TeacherRepositroyImpl() {
			teachers = new ArrayList<TeacherDomain>();
			
			teachers.add(new TeacherDomain(1, "sagar" ,"kalthiya","Android"));
			teachers.add(new TeacherDomain(2, "rohit" ,"namdev" , "Java"));
			teachers.add(new TeacherDomain(3, "rashi" ,"jain" , "C++"));
			teachers.add(new TeacherDomain(4, "manav" ,"jindal" , "Hybernate"));
			teachers.add(new TeacherDomain(5, "parth" ,"waghela" , "Java"));
			teachers.add(new TeacherDomain(6, "sejal" ,"jain" , "C++"));
			teachers.add(new TeacherDomain(7, "sandeep" ,"jain" , "Spring Boot "));
		}
	 

	@Override
	public List<TeacherDomain> getAllTeacher() {
		// TODO Auto-generated method stub
		return teachers;
	}

	@Override
	public TeacherDomain addTeacher(TeacherDomain teacher) {
		// TODO Auto-generated method stub
		teachers.add(teacher);
		return teacher;
	}

	@Override
	public String deleteTeacher(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Student id to deleted"+id);
		String s="";
		int index =0;
		for(int i = 0 ; i<teachers.size() ;i++) {
			TeacherDomain student = teachers.get(i);
			if(student.getId() == id) {
				index = i;
			}
		}
		teachers.remove(index);
		s = "student deleted";
		
		return s;
	}

	@Override
	public TeacherDomain updateTeacher(Integer id, TeacherDomain teacher) {
		// TODO Auto-generated method stub
		for(TeacherDomain tech : teachers) {
			if(tech.getId() == id) {
				tech.setId(id);
				tech.setFirstName(teacher.getFirstName());
				tech.setLastName(teacher.getLastName());
				tech.setSpecialization(teacher.getSpecialization());
			}
		}
		return teacher;
	}

	@Override
	public List<TeacherDomain> getTeacherBySubject(String specialization) {
		// TODO Auto-generated method stub
		System.out.println("Specialization in subject :- "+specialization);
		List<TeacherDomain> filterteacher  = new ArrayList<TeacherDomain>();
		
		for(TeacherDomain tech:teachers) {
			if(tech.getSpecialization().equals(specialization)) {
				filterteacher.add(tech);
			}
		}		
		return filterteacher;
	}
	
   

}
