package com.nt.training.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class School {
	private String name;
	private String address;
	private Student student;
	private Teacher Teacher;
	
	public School() {
	}
	@Autowired
	public School(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return Teacher;
	}
	@Autowired
	public void setTeacher(Teacher teacher) {
		Teacher = teacher;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + ", student=" + student + ", Teacher=" + Teacher + "]";
	}
	
	
	
}
