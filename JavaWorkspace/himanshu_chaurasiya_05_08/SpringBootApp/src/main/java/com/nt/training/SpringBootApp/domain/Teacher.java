package com.nt.training.SpringBootApp.domain;

public class Teacher {

	private Integer teachId;
	private String teachFirstName;
	private String teachLastName;
	public Integer getTeachId() {
		return teachId;
	}
	public void setTeachId(Integer teachId) {
		this.teachId = teachId;
	}
	public String getTeachFirstName() {
		return teachFirstName;
	}
	public void setTeachFirstName(String teachFirstName) {
		this.teachFirstName = teachFirstName;
	}
	public String getTeachLastName() {
		return teachLastName;
	}
	public void setTeachLastName(String teachLastName) {
		this.teachLastName = teachLastName;
	}
	public Teacher(Integer teachId, String teachFirstName, String teachLastName) {
		super();
		this.teachId = teachId;
		this.teachFirstName = teachFirstName;
		this.teachLastName = teachLastName;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [teachId=" + teachId + ", teachFirstName=" + teachFirstName + ", teachLastName=" + teachLastName
				+ "]";
	}
	
}
