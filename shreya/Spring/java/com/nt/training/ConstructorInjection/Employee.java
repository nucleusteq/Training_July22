package com.nt.training.ConstructorInjection;

public class Employee {
	private int rollNumber;
	private String employeeName;
	private String employeeAge;
	private String phoneNumber;
	
	public Employee() {
	}

	public Employee(int rollNumber, String employeeName, String employeeAge, String phoneNumber) {
		super();
		this.rollNumber = rollNumber;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.phoneNumber = phoneNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [rollNumber=" + rollNumber + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", phoneNumber=" + phoneNumber + "]";
	}
}