package com.nt.training.simpleannotation;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	

	private String name;

	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Teacher(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Teacher [name=" + name + "]";
	}
	

}
