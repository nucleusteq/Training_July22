package com.Spring.collection.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person1 {

	private String name;
	private List<String> number;
	private Set<String> address;
	private Map<String, String> courses;
	
	 
	@Override
	public String toString() {
		return "Person [name=" + name + ", number=" + number + ", address=" + address + ", courses=" + courses + "]";
	}
	public Person1(String name, List<String> number, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
		this.courses = courses;
	}
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getNumber() {
		return number;
	}
	public void setNumber(List<String> number) {
		this.number = number;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}
