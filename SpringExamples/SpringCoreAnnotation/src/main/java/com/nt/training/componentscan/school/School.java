package com.nt.training.componentscan.school;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class School {

	public String name;
	
	public School() {
		
	}

	public School(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public  void init() throws Exception{
		System.out.println("Init method for school bean");
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("Destroy method for school bean");
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}
	
	
	
	
	
}
