package com.mt.training.ConstructorInjection;
import java.util.List;

public class School {
	private String name;
	private String contactNumber;
	private List<Student> students;
	public School() {

	}
	public School(String name, String contactNumber, List<Student> students) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.students = students;
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", contactNumber=" + contactNumber + ", students=" + students + "]";
	}
	
}