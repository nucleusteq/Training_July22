package com.nt.training.beanTesting;

public class TestBean {
	private int serialno;
	private String nameOfStudent;
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public String getNameOfStudent() {
		return nameOfStudent;
	}
	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}
	@Override
	public String toString() {
		return "testBean [serialno=" + serialno + ", nameOfStudent=" + nameOfStudent + "]";
	}
	public TestBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}
