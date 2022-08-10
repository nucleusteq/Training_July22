package com.nt.training.newspringpractice;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + "]";
	}
	public Teacher(String id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}
