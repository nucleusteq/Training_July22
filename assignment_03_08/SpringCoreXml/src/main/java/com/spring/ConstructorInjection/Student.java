package com.spring.ConstructorInjection;

public class Student {
	private int rollNumber;
	private String studentName;
	
	public Student() {
		
	}
	
	public Student(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;

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


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + "studentName + "+ "]";
	}
	
	
}