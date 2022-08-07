package com.nt.training.ConstructorInjection;
import java.util.List;

public class Office {

	private String name;
	private String contactNumber;
	private List<Employee> employee;
	
	public Office() {
		super();
	}
	
	public Office(String name, String contactNumber, List<Employee> employee) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.employee = employee;
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

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Office [name=" + name + ", contactNumber=" + contactNumber + ", employee=" + employee + "]";
	}
}