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

import com.nt.training.SpringBootApplication.domain.Student;
import com.nt.training.SpringBootApplication.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(path = "getStudents" , method = RequestMethod.GET)
	public @ResponseBody List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@RequestMapping(path = "/save" , method = RequestMethod.POST)
	public @ResponseBody Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@RequestMapping(path = "/delete/{id}" ,  method =RequestMethod.DELETE)
	public String deleteStudent(@PathVariable("id") Integer id) {
		System.out.println("id:"+id);
		return studentService.deleteStudent(id);
	}
	
	
	@RequestMapping(path = "/update/{id}" , method = RequestMethod.PUT)
	public @ResponseBody Student updateStudent(@PathVariable("id") Integer id , @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}
	
	@RequestMapping(path = "/getStudentByFirstName" ,  method=RequestMethod.GET)
	public List<Student> getStudentByFirstName(@RequestParam("firstName") String firstName){
		return studentService.getStudentByFirstName(firstName);
	}
}