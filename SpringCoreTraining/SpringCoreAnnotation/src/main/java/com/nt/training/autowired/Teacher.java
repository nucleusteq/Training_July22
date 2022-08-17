package com.nt.training.autowired;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private int id;
	private String name;
	private String contactNumber;
	private String emailId;
	public Teacher() {
		
	}
	public Teacher(int id, String name, String contactNumber, String emailId) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ "]";
	}
	

}
