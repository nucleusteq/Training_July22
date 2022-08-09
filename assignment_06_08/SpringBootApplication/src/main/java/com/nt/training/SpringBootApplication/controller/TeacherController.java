package com.nt.training.SpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.service.TeacherService;

@RestController
public class TeacherController {
	
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(path = "getTeachers" , method = RequestMethod.GET)
	public @ResponseBody List<Teacher> getAllStudent(){
		return teacherService.getAllStudent();
	}
	
	@RequestMapping(path = "/save" , method = RequestMethod.POST)
	public @ResponseBody Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}

	@RequestMapping(path = "/delete/{id}" ,  method =RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable("id") Integer id) {
		System.out.println("id:"+id);
		return teacherService.deleteStudent(id);
	}
	
	
	@RequestMapping(path = "/update/{id}" , method = RequestMethod.PUT)
	public @ResponseBody Teacher updateTeacher(@PathVariable("id") Integer id , @RequestBody Teacher teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
	
	@RequestMapping(path = "/getTeacherByFirstName" ,  method=RequestMethod.GET)
	public List<Teacher> getTeacherByFirstName(@RequestParam("firstName") String firstName){
		return teacherService.getTeacherByFirstName(firstName);
	}
}