package com.training.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class School {
	private Student student;
	private Teacher teacher;
	@Autowired
	public School(Student student) {
		super();

		this.student = student;
		
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
	@Override
	public String toString() {
		return "School [student=" + student + ", teacher=" + teacher + "]";
	}
	
}
