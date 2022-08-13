package com.nt.training.TeacherSpringBootAndJPAApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.TeacherSpringBootAndJPAApplication.entity.Teacher;
import com.nt.training.TeacherSpringBootAndJPAApplication.service.impl.TeacherServiceImpl;

@RestController
public class TeacherController {

	@Autowired
	TeacherServiceImpl teacherService;
	
	@RequestMapping(path="/addTeacher",method = RequestMethod.POST)
	public @ResponseBody Teacher addTeacher(@RequestBody Teacher teacher) {
		teacherService.addTeacher(teacher);
		return teacher;
	}
	
	@RequestMapping(path="/getAllTeachers",method=RequestMethod.GET)
	public @ResponseBody List<Teacher> getAllTeachers(){
		
		return teacherService.getAllTeachers();
	}
	
	@RequestMapping(path="/getTeacherById/{id}",method=RequestMethod.POST)
	public Teacher getTeacherById(@PathVariable("id") int id) {
		return teacherService.getTeacherFromId(id);
	}
	
	@RequestMapping(path="/removeTeacher/{id}",method=RequestMethod.DELETE)
	public String removeTeacher(@PathVariable("id") int id) {
		return teacherService.removeTeacherById(id);
	}
	
	@RequestMapping(path="/updateTeacher/{id}",method=RequestMethod.PUT)
	public Teacher updateTeacher(@PathVariable("id") int id,@RequestBody Teacher teacher) {
		Teacher existingTeacher=teacherService.getTeacherFromId(id);
		existingTeacher.setFirstName(teacher.getFirstName());
		existingTeacher.setLastName(teacher.getLastName());
		existingTeacher.setAge(teacher.getAge());
		existingTeacher.setEmailId(teacher.getEmailId());
		existingTeacher.setContactNumber(teacher.getContactNumber());
		return teacherService.updateTeacher(existingTeacher);
	}
	
	
	@RequestMapping(path="/getTeachersFromFirstName/{firstName}",method=RequestMethod.POST)
	public @ResponseBody List<Teacher> getTeacherFromFirstName(@PathVariable("firstName") String firstName){
		return teacherService.getTeacherFromFirstName(firstName);
	}
	
	@RequestMapping(path="/getTeachersFromLastName/{lastName}",method=RequestMethod.POST)
	public @ResponseBody List<Teacher> getTeachersFromLastName(@PathVariable("lastName") String lastName){
		return teacherService.getTeacherFromLastName(lastName);
	}
	
}
