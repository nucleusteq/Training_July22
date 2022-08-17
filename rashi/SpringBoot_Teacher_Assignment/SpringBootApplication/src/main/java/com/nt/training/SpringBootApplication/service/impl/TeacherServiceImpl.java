package com.nt.training.SpringBootApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.repository.impl.TeacherRepositoryImpl;
import com.nt.training.SpringBootApplication.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepositoryImpl teacherRepository;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepository.addTeacher(teacher);
	}
	
	@Override
	public List<Teacher> getAllTeachers() {
		
		return teacherRepository.getAllTeachers();
	}
	
	
	@Override
	public String removeTeacher(int id) {
		if(id<0) {
			return "Invalid ID";
		}
		return teacherRepository.removeTeacher(id);
	}

	@Override
	public String updateTeacher(int id, Teacher teacher) {
		if(id <= 0 || id != teacher.getId()) {
			return "Invalid ID";
		}
		return teacherRepository.updateTeacher(id, teacher);
	}

	@Override
	public Teacher getTeacherFromId(int id) {
		
		return teacherRepository.getTeacherFromId(id);
	}

	@Override
	public List<Teacher> getTeacherFromFirstName(String firstName) {
		
		return teacherRepository.getTeacherFromFirstName(firstName);
	}

	@Override
	public List<Teacher> getTeacherFromLastName(String lastName) {
		
		return teacherRepository.getTeacherFromLastName(lastName);
	}

}