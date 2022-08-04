package com.clearn.logic.SetterInjection;

public class Office {
private String name;
private String contactNumber;
private Employee employee;


public Office() {
	
}
public Office(String name, String contactNumber, Employee employee) {
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
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
	
}
@Override
public String toString() {
	return "Office [name=" + name + ", contactNumber=" + contactNumber + ", employee=" + employee + "]";
}
}
