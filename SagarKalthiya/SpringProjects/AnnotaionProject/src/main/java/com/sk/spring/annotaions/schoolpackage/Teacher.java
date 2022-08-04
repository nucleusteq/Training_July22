package com.sk.spring.annotaions.schoolpackage;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private int techId;
	private String techName;
	
	public Teacher() {
		
	}
	
	public Teacher(int techId, String techName) {
		super();
		this.techId = techId;
		this.techName = techName;
	}
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	@Override
	public String toString() {
		return "Teacher [techId=" + techId + ", techName=" + techName + "]";
	}
	
	
}
