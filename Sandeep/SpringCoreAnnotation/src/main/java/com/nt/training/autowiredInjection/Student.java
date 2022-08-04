package com.nt.training.autowiredInjection;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public Integer id;
	public String name;
	
	public Student() {
		
	}
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
