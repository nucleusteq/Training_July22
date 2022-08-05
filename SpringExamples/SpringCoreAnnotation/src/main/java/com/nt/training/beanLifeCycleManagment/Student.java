package com.nt.training.beanLifeCycleManagment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	public String name;
	public Integer id;
	
	public Student() {
		
	}

	public Student(String name, Integer id) {
		
		this.name = name;
		this.id = id;
	}

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

	@PostConstruct
	public  void init() throws Exception{
		System.out.println("Init method for student bean: "+ this.toString());
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("Destroy method for student bean: " + this.toString());
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	
	
}
