package com.nt.springannotation;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private String teachName;
	private Integer teachId;
	public String getTeachName() {
		return teachName;
	}
	public void setTeachName(String teachName) {
		this.teachName = teachName;
	}
	public Integer getTeachId() {
		return teachId;
	}
	public void setTeachId(Integer teachId) {
		this.teachId = teachId;
	}
	@Override
	public String toString() {
		return "Teacher [teachName=" + teachName + ", teachId=" + teachId + "]";
	}
	public Teacher(String teachName, Integer teachId) {
		super();
		this.teachName = teachName;
		this.teachId = teachId;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
