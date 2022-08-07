package com.nt.training.SpringBootApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.SpringBootApplication.repository.TeacherRepository;
import com.nt.training.SpringBootApplication.domain.Teacher;
import java .util.List;
import com.nt.training.SpringBootApplication.service.TeacherService;


@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Override
	public List<Teacher>getAllTeacher(){
		
		
		return teacherRepository.getAllTeacher() ;
	}

}
