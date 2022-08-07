package com.nt.training.SpringBootApplication.service;

import java.util.List;

import com.nt.training.SpringBootApplication.domain.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	public Student saveStudent(Student student) ;
	public String deleteStudent(Integer id);
	public Student updateStudent(Integer id, Student student);
	public List<Student> getStudentByFirstName(String firstName);
	
}
