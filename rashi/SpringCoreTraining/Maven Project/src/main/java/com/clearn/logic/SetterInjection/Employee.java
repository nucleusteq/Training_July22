package com.clearn.logic.SetterInjection;

public class Employee {

	String name;
	String profile;
	int id;
	
	
	public Employee() {
		
	}
	
	
	public Employee(String name, String profile, int id) {
		super();
		this.name = name;
		this.profile = profile;
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", profile=" + profile + ", id=" + id + "]";
	}
}


