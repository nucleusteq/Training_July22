package com.SpringTeacher.SpringTeacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringTeacher.SpringTeacher.entities.Teacher;
import com.SpringTeacher.SpringTeacher.services.TeacherService;


@RestController
public class MyController {
	
	@Autowired
	private TeacherService teacherService;

	@GetMapping("/home")
	public String home() {
		
		return "welcome to Teacher Application";
	}
	
	//get the Teacher
	@GetMapping("/teachers")
	public List<Teacher> getTeachers(){
		
		return this.teacherService.getTeachers();	
	}
	
	@GetMapping("/teachers/{teacherId}")
	public Teacher getTeacher(@PathVariable String teacherId) {
		return this.teacherService.getTeacher(Long.parseLong(teacherId));
	}
	
	@PostMapping("/teachers")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return this.teacherService.addTeacher(teacher);
	}
	
	/*@PostMapping("/teachers")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		return this.teacherService.updateTeacher(teacher);
	}*/
	
	/*@PostMapping("/teachers/{teacherId}")
	public Teacher deleteTeacher(@PathVariable String teacherId) {
		return this.teacherService.deleteTeacher(Long.parseLong(teacherId));
	
	*/
	
}
