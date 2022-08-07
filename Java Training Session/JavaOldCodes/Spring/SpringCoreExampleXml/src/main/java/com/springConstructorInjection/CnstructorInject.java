package com.springConstructorInjection;

public class CnstructorInject {
	private String name;
	private int id;
	
	public CnstructorInject(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	

	
	public CnstructorInject() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "CnstructorInject [name=" + name + ", id=" + id + "]";
	}
	
	

}
