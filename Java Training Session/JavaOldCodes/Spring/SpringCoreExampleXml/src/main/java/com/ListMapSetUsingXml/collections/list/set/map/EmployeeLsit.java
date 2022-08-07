package com.training.collections.list.set.map;

import java.util.Map;
import java.util.Set;
import java.util.List;

public class EmployeeLsit {
	private String name;
	private List<String> clothes;
	private Set<String> address;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getClothes() {
		return clothes;
	}
	public void setClothes(List<String> clothes) {
		this.clothes = clothes;
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
	@Override
	public String toString() {
		return "EmployeeLsit [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}
	public EmployeeLsit(String name, List<String> clothes, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.clothes = clothes;
		this.address = address;
		this.courses = courses;
	}
	public EmployeeLsit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
