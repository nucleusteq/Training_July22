package com.nt.springannotation;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String stName;
	private Integer stId;
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public Integer getStId() {
		return stId;
	}
	public void setStId(Integer stId) {
		this.stId = stId;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String stName, Integer stId) {
		super();
		this.stName = stName;
		this.stId = stId;
	}
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", stId=" + stId + "]";
	}
	
	
	
}
