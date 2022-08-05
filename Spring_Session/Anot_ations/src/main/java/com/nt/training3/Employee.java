package com.nt.training3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {


	private int id;
	private String name;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@PostConstruct
	public void init() {
		System.out.println("PostDestroy anotation of destroy called by employee");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("PreDestroy anotation of destroy called by employee");
	}
}

