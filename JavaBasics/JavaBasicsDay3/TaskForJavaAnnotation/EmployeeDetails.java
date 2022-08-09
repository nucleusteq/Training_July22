import java.io.*;
import java.util.Scanner;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author Nucleusteq
 *
 */
	@Target(ElementType.FIELD)
	@Retention (RetentionPolicy.RUNTIME)
	
	@interface EmployeeField 
	{
	    String name();
	    Class<?> type();
	    boolean isPrimaryKey() default false;
	}
	
	class EmployeeDetails {  
	    //Creating properties of Employee class  
	@EmployeeField (name = "empId" , type=int.class ,isPrimaryKey=true)
		int empId; 
	
	@EmployeeField (name = "name", type=String.class)
	String name;
	@EmployeeField (name = "department", type=String.class)
	String department;
	@EmployeeField (name = "emailAddress", type=String.class)
	String emailAddress;  
	  
	//Getter and setters for getting and setting properties  
	public int getEmpId() {  
	    return empId;  
	}  
	public void setEmId(int emp_id) {  
	    this.empId = empId;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  

	public String getDepartment(int a,int b) {  
	    return department;  
	}  
	public void setDepartment(String department) {  
	    this.department = department;  
	}  
	public String getEmail() {  
	    return emailAddress;  
	}  
	public void setEmail(String email) {  
	    this.emailAddress = emailAddress;  
	}  
	}
	
//	public class EmployeeDetails{
//		public static void main(String args[]) {
//			Employee emp = new Employee();
//			emp.setName("Himanshu");
//			emp.setEmp_id(101);
//			emp.setDepartment("Software Development");
//			emp.setEmail("himanshu007@gmail.com");
//			 System.out.println(emp.name);
//			 System.out.println(emp.emp_id);
//			 System.out.println(emp.department);
//			 System.out.println(emp.email);
//			 
//		}
		
	