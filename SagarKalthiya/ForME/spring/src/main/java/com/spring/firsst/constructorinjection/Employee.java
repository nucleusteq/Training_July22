package com.spring.firsst.constructorinjection;

import java.util.List;

public class Employee {
	private int empId;
	private List<?> name;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<?> getName() {
		return name;
	}
	public void setName(List<?> name) {
		this.name = name;
	}
	public Employee(int empId, List<?> name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	
	

}
