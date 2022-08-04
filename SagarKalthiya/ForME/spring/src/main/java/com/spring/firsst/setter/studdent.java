package com.spring.firsst.setter;

public class studdent {
	private int stuRollNo;
	private String StuName;
	private String Section;
	public studdent(int stuRollNo, String stuName, String section) {
		super();
		this.stuRollNo = stuRollNo;
		StuName = stuName;
		Section = section;
	}
	public studdent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStuRollNo() {
		return stuRollNo;
	}
	public void setStuRollNo(int stuRollNo) {
		this.stuRollNo = stuRollNo;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	@Override
	public String toString() {
		return "studdent [stuRollNo=" + stuRollNo + ", StuName=" + StuName + ", Section=" + Section + "]";
	}

	
	
	
}
