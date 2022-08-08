package com.nt.training.Teacher;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Teacher {
	@Id
	@SequenceGenerator(
			name = "teacher_sequence",
			sequenceName = "teacher_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "teacher_sequence"
			)
	private long id;
	private String name;
	private String subject;
	private LocalDate dob;
	
	@Transient
	private int age;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(long id, String name, String subject, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.dob = dob;
	}
	public Teacher(String name, String subject, LocalDate dob) {
		super();
		this.name = name;
		this.subject = subject;
		this.dob = dob;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", dob=" + dob + ", age=" + age + "]";
	}
	
	
	
}
