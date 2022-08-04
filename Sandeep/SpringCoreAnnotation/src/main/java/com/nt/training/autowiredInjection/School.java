package com.nt.training.autowiredInjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class School {
	private String name;
	private Student student;
	private Teacher teacher;
	
	@Autowired
	public School(Student student) {
		super();
		System.out.println("student dependency Constructor Injection");
		this.student = student;
	}

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
		System.out.println("teacher dependency Setter Injection");
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", student=" + student + ", teacher=" + teacher + "]";
	}
	
	
}
