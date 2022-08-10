package com.nt.training.beanscope;

public class BeanScopeAnnotations {
	private String subject;
	private String faculty;
	public String getSubject() {
		System.out.println("Details: "+subject);
		return subject; 
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}	
}
