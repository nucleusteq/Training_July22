package com.nt.training.SpringBootApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.SpringBootApplication.domain.Teacher;
import com.nt.training.SpringBootApplication.service.impl.TeacherServiceImpl;

@RestController
public class TeacherController {

	@Autowired
	TeacherServiceImpl teacherService;
	
	@RequestMapping(path="/teacherAdd",method = RequestMethod.POST)
	public  @ResponseBody Teacher teacherAdd(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	@RequestMapping(path="/getAllTeachers",method=RequestMethod.GET)
	public @ResponseBody List<Teacher> getAllTeachers(){
		return teacherService.getAllTeachers();
	}
	
	@RequestMapping(path="/teacherRemove/{id}",method = RequestMethod.DELETE)
	public @ResponseBody String teacherRemove(@PathVariable("id") Integer id) {
		System.out.println(id);
		return teacherService.removeTeacher(id);
	}
	
	@RequestMapping(path="/teacherUpdate/{id}",method = RequestMethod.PUT)
	public @ResponseBody String teacherUpdate(@PathVariable("id") int id,@RequestBody Teacher teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
	
	@RequestMapping(path="/getTeacherFromId/{id}",method=RequestMethod.POST)
	public @ResponseBody Teacher getTeacherFromId(@PathVariable("id") int id) {
		return teacherService.getTeacherFromId(id);
	}
	
	@RequestMapping(path="/getTeachersFromFistName/{firstName}",method=RequestMethod.POST)
	public @ResponseBody List<Teacher> getTeacherFromFirstName(@PathVariable("firstName") String firstName){
		return teacherService.getTeacherFromFirstName(firstName);
	}
	
	@RequestMapping(path="/getTeachersFromLastName/{lastName}",method=RequestMethod.POST)
	public @ResponseBody List<Teacher> getTeachersFromLastName(@PathVariable("lastName") String lastName){
		return teacherService.getTeacherFromLastName(lastName);
	}
}