import java.io.*;
import java.util.Scanner;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

	@Retention (RetentionPolicy.RUNTIME)
	@interface EmployeeField 
	{
	    String name();
	    String type();
	    String isPrimaryKey();
	}
	package Employee;

	public class Employee {

	}
	class EmployeeDetails {  
	    //Creating properties of Employee class  
	int emp_id;  
	String name, address, department, email;  
	  
	//Getter and setters for getting and setting properties  
	public int getEmp_id() {  
	    return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getAddress() {  
	    return address;  
	}  
	public void setAddress(String address) {  
	    this.address = address;  
	}  
	public String getDepartment() {  
	    return department;  
	}  
	public void setDepartment(String department) {  
	    this.department = department;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	}