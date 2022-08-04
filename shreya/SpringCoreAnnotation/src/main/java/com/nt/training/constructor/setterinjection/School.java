package com.nt.training.constructor.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class School {

	private String name;
	
	private Student student;
	
	private Teacher teacher;

	
	public School() {
		super();
	}


	public School(String name, Student student, Teacher teacher) {
		super();
		this.name = name;
		this.student = student;
		this.teacher = teacher;
	}

    @Autowired 
	public School(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

    @Autowired 
	public School(Student student) {
		super();
		this.student = student;
	}


	@Override
	public String toString() {
		return "School [name=" + name + ", student=" + student + ", teacher=" + teacher + "]";
	}
	
	
	
}
