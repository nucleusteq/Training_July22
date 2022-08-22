package com.nt.training.SpringBootApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_detail")
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer teachId;
	
	@Column(name="first_name")
	private String teachFirstName;
	
	@Column(name="last_name")
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
