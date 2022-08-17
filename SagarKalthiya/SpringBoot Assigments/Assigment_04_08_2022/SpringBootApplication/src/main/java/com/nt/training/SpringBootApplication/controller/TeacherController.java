package com.nt.training.SpringBootApplication.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.nt.training.SpringBootApplication.domain.TeacherDomain;
import com.nt.training.SpringBootApplication.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(path = "getAllTeachers" , method = RequestMethod.GET)
	public @ResponseBody List<TeacherDomain> getAllTeacher(){
		return teacherService.getAllTeacher();
	}
	
	
	@RequestMapping(path = "/addTeacher" , method = RequestMethod.POST)
	public @ResponseBody TeacherDomain addTeacher(@RequestBody TeacherDomain teacher) {
		return teacherService.addTeacher(teacher);
	}

	@RequestMapping(path = "/deleteTeacher/{id}" ,  method =RequestMethod.DELETE)
	public String deleteTeacher(@PathVariable("id") Integer id) {
		System.out.println("id:"+id);
		return teacherService.deleteTeacher(id);
	}
	
	
	@RequestMapping(path = "/updateTeacher/{id}" , method = RequestMethod.PUT)
	public @ResponseBody TeacherDomain updateTeacher(@PathVariable("id") Integer id , @RequestBody TeacherDomain teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
	
	@RequestMapping(path = "/getTeacherBySubject" ,  method=RequestMethod.GET)
	public List<TeacherDomain> getTeacherBySubject(@RequestParam("specialization") String specialization){
		return teacherService.getTeacherBySubject(specialization);
	}

}
