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
		return teacherRepo.findAll();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@Override
	public String removeTeacher(Integer teach_id) {
		String result="Teacher ID Not Found in Database";
		if((teacherRepo.findById(teach_id)).isEmpty() == true)
		{
			return result;	
		}
		else {
			teacherRepo.deleteById(teach_id);
			result = "Teacher "+teach_id+" Deleted Successfully!";
			return result;
		}

	}

}
