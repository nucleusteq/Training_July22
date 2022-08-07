package com.training.SpringBootTeachersApplication.TeacherController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.SpringBootTeachersApplication.domain.Teacher;
import com.training.SpringBootTeachersApplication.service.TeacherService;

@RestController
public class TeacherController {


	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(path = "/getTeacher" , method = RequestMethod.GET)
	public @ResponseBody List<Teacher> getAllTeacher(){
		return teacherService.getAllTeacher();
	}
	
	@RequestMapping(path = "/save" , method = RequestMethod.POST)
	public @ResponseBody Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}

	@RequestMapping(path = "/delete/{id}" ,  method =RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") Integer id) {
		System.out.println("id:"+id);
		return teacherService.deleteTeacher(id);
	}
	
	
	@RequestMapping(path = "/update/{id}" , method = RequestMethod.PUT)
	public @ResponseBody Teacher updateStudent(@PathVariable("id") Integer id , @RequestBody Teacher teacher) {
		return teacherService.updateTeacher(id, teacher);
	}
	
	@RequestMapping(path = "/getTeacherById" ,  method=RequestMethod.GET)
	public Teacher getTeacherById(@RequestParam("id") Integer id){
		return teacherService.getTeacherById(id);
	}
}
