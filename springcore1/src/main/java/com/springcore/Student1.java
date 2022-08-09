package com.springcore;

public class Student1 {
   private int studentId;
   private String studentName;
   private String studentAddress;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public Student1() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student1 [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}
}
