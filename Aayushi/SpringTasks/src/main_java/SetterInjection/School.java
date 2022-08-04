package com.spring.SetterInjection;

public class School {
	private String name;
	private Student student;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, Student student) {
		super();
		this.name = name;
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
