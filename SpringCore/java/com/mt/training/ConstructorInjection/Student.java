package com.mt.training.ConstructorInjection;


public class Student {
	private int rollNumber;
	private String studentName;
	private String studentAge;
	private String phoneNumber;
	
	public Student() {
		
	}
	
	public Student(int rollNumber, String studentName, String studentAge, String phoneNumber) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.phoneNumber = phoneNumber;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}