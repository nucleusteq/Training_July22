package com.spring.firsst.ConsInjection;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private List<Office> office;
 
	public Employee(List<Office> office){
		this.office = (List<Office>) office;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Office> getOffice() {
		return office;
	}

	public void setOffice(List<Office> office) {
		this.office = office;
	}
 
	
}







/* {  
	private int id;  
	private String name;  
	  
	public Employee() {System.out.println("def cons");}  
	  
	public Employee(int id) {this.id = id;}  
	  
	public Employee(String name) {  this.name = name;}  
	  
	public Employee(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	  
	void show(){  
	    System.out.println(id+" "+name);  
	}  
	  
	}  
*/