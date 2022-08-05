package com.nt.training4;


import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private String contactNumber;
	
	public Student() {
	
	}
	
	public Student(int id, String name, String contactNumber) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + "]";
	}
	
	
}

