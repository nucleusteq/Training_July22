package com.sk.spring.annotaions.schoolpackage;

import org.springframework.stereotype.Component;

@Component
public class Students {
	
	private int stuId;
	private String stuName;
	public Students(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}
	

}
