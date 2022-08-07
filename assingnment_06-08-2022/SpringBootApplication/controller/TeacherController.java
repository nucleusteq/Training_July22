package com.nt.training.SpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.service.TeacherService;


@RestController
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;

	@RequestMapping(path="geteachers" ,method =RequestMethod.GET)
	public @ResponseBody List<Teacher>getAllTeacher(){ 
		return teacherService.getAllTeacher();
	}
}

