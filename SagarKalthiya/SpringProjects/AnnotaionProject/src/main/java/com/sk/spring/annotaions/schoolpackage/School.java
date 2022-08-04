package com.sk.spring.annotaions.schoolpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	private String name;
	private Students stu;
	private Teacher techer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Students getStu() {
		return stu;
	}
	public void setStu(Students stu) {
		this.stu = stu;
	}
	public Teacher getTecher() {
		return techer;
	}
	
	@Autowired
	public void setTecher(Teacher techer) {
		System.out.println("Setter method:-");
		this.techer = techer;
	}
	
	@Autowired
	public School(Students stu) {
		this.stu = stu;
		System.out.println("COnstructor method");
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", stu=" + stu + ", techer=" + techer + "]";
	}
	
	
	

}
