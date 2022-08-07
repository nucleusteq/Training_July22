package com.crud.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(path = "getAll" , method = RequestMethod.GET)
	public @ResponseBody List<Teacher> getAllTeacher(){
		return teacherService.getAllTeacher();
	}

	
	@RequestMapping(path = "/delete/{id}" ,  method =RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable("id") Integer id) {
		System.out.println("id:"+id);
		return teacherService.deleteTeacher(id);
	}
	
	
	@RequestMapping(path = "/update/{id}" , method = RequestMethod.PUT)
	public @ResponseBody Teacher updateTeacher(@PathVariable("id") Integer id , @RequestBody Teacher teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
}
