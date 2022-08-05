package com.nt.training.autowiredQualifier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class School {
	private String name;
	private Student student;

	
	@Autowired
	public School(@Qualifier("student1") Student student) {
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

	@Override
	public String toString() {
		return "School [name=" + name + ", student=" + student + "]";
	}
}
