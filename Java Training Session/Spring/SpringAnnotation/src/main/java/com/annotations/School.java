package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Value("Nucluesteq")
	private String name;
	private Student student;
	private Teacher teacher;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Autowired
	public School(Student student) {
		
		this.student = student;
		
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", student=" + student + ", teacher=" + teacher + "]";
	}
	
	

}
