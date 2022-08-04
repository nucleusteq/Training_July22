package com.nt.training.beansLifecycle;

public class School {

	private Integer id;
	private String name;
	
	
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(Integer id, String name) {
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
		return "School [id=" + id + ", name=" + name + "]";
	}
	
	
	public void init() {
		System.out.println("Init method called");
	}
	
	public void destroy() {
		System.out.println("Destroy method");
	}
	
}
