package com.training.SpringBootTeachersApplication.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_table")
public class Teacher {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Teachers [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
