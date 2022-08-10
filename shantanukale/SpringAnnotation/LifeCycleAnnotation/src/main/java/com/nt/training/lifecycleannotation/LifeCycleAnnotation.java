package com.nt.training.lifecycleannotation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleAnnotation {
	private String name;
	private String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Autowired
	public LifeCycleAnnotation(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "LifeCycleAnnotation [name=" + name + ", department=" + department + "]";
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean is created");
	}
	
	@PostConstruct
	public void destroy() {
		System.out.println("Bean is destroyed");
	}
	
}
