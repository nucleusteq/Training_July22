package com.nt.training.TeacherSpringBootApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.TeacherSpringBootApplication.model.Teacher;
import com.nt.training.TeacherSpringBootApplication.repository.impl.TeacherRepositoryImpl;
import com.nt.training.TeacherSpringBootApplication.service.TeacherService;

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
			return "Not a valid value";
		}
		return teacherRepository.removeTeacher(id);
	}

	@Override
	public String updateTeacher(int id, Teacher teacher) {
		if(id <= 0 || id != teacher.getId()) {
			return "Teacher id is invalid";
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
