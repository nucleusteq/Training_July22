package com.traning.beanconfig;

public class School {
	private String student;
	private Integer id;
	
	
	
	public School() {
		super();
		
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "School [student=" + student + ", id=" + id + "]";
	}
//	public static void main(String[] args) {
//		System.out.println("student name=" +student+ "ID=" +id);
//	}
//	
	
}
