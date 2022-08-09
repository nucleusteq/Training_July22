package com.spring.ConstructorInjection;

import java.util.List;

public class School {
	private String schoolname;
	private List<Student> students;
	public School() {

	}
	public School(String schoolname, List<Student> students) {
		super();
		this.schoolname = schoolname;
		this.students = students;
	}
	public String getName() {
		return schoolname;
	}
	public void setName(String schoolname) {
		this.schoolname = schoolname;
	}

	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "School [name=" + schoolname + ", students=" + students + "]";
	}
	
}