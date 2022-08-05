package com.nt.training.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component
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
		System.out.println("Init method for student bean");
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("Destroy method for student bean");
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	
	
}
