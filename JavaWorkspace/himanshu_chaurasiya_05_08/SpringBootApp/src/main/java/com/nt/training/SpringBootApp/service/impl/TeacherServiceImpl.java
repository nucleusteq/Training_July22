package com.nt.training.SpringBootApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.SpringBootApp.domain.Teacher;
import com.nt.training.SpringBootApp.repository.TeacherRepo;
import com.nt.training.SpringBootApp.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepo teacherRepo;

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherRepo.getAllTeacher();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepo.addTeacher(teacher);
	}

	@Override
	public String removeTeacher(Integer id) {
		return teacherRepo.removeTeacher(id);
	}

	@Override
	public String updateTeacher(Integer id, Teacher teach) {
		return teacherRepo.updateTeacher(id, teach);
	}

	@Override
	public List<Teacher> getByName(String teachName) {
		return teacherRepo.getByName(teachName);
	}

}
