package com.nt.training.SpringBootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.SpringBootApp.domain.Teacher;
import com.nt.training.SpringBootApp.service.TeacherService;


@RestController
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping (path="/",method=RequestMethod.GET)
	public @ResponseBody List<Teacher> getAllTeacher(){
		return teacherService.getAllTeacher();
	}
	
	@RequestMapping (path="/add",method=RequestMethod.POST)
	public @ResponseBody Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	@RequestMapping (path="/delete/{id}",method=RequestMethod.DELETE)
	public String removeTeacher(@PathVariable("id") Integer id) {
		String result = teacherService.removeTeacher(id);
		return result;
	}
	
	@RequestMapping(path = "/update/{id}" , method = RequestMethod.PUT)
	public String updateTeacher(@PathVariable("id") Integer id ,@RequestBody Teacher teacher) {
		String result = teacherService.updateTeacher(id, teacher);
		return result;
	}
	
	@RequestMapping(path = "/getByName/{name}" , method = RequestMethod.GET)
	public @ResponseBody List<Teacher> getByName(@PathVariable("name") String name) {
		List<Teacher> result = teacherService.getByName(name);
			return result;
	}
}
