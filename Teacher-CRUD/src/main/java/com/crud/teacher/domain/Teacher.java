package com.crud.teacher.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Teacher {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)	
	private int id;
	private String teacher_name;
	private String subject;
	
	public Teacher(int id, String teacher_name,String subject) {
		super();
		this.id=id;
		this.teacher_name=teacher_name;
		this.subject=subject;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
