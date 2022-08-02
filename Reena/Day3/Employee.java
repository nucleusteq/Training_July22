package Employee;


import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
/**
 * 
 * @author Reena
 *@version 1.0
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
	public void setEmpId(int empId) {  
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
	public void setEmail(String emailAddress) {  
	    this.emailAddress = emailAddress;  
	}  
	}


public class Employee {


	public static void main(String[] args) throws Exception {
	
		System.out.println();
		
		EmployeeDetails ed= new EmployeeDetails();
		ed.setName("Reena");
		ed.setEmpId(6);
		ed.setDepartment("tech");
		ed.setEmail("Reena.com");
		
		for( Field field: ed.getClass().getDeclaredFields())
		{
		EmployeeField employeefield  = field.getAnnotation(EmployeeField.class);
		System.out.println("field name" + "\t" + employeefield.name() );
		
		
		field.setAccessible(true);
		Object value = field.get(ed);
		System.out.println("field value"+ "\t" + value);
		
		
	        System.out.println("field type: " +"\t" + employeefield.type()  );
	        System.out.println("field isPrimarykey: " +"\t" + employeefield.isPrimaryKey() +"\n" );
	        
	       }
		System.out.println();
		
	}


	}