package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Value("12")
	private Integer id ;
	@Value("Sandeep Jain")
	private String name;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(Integer id, String name) {
		super();
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
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
	

}
