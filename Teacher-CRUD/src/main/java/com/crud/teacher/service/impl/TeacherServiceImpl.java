package com.crud.teacher.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.teacher.domain.Teacher;
import com.crud.teacher.repository.TeacherRepository;

@Service
public class TeacherServiceImpl {

	
	@Autowired
	TeacherRepository teacherRepository;
	
	public Teacher saveTeacher(Teacher teacher) {
		Teacher tea= teacherRepository.saveTeacher(teacher);
		return tea;
	}
}
