package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Student {
	@Value("Piyush")
	private String name;
	@Value("28")
	private Integer id;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	

}
