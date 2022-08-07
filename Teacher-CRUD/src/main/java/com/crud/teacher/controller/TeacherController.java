package com.crud.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.teacher.domain.Teacher;
import com.crud.teacher.service.TeacherService;

@RestController

public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(path="/save", method=RequestMethod.POST)
	public @ResponseBody Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	
	}

}
