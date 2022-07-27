package Exeption_Handling;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)	
@Target(ElementType.FIELD)
@interface EmployeeField{
	String name();
	Class< ?> type();
	boolean isPrimaryKey();
}


//This is Pojo class
class EmployeeDetails{
	@EmployeeField(name="Emp_Id",type=String.class,isPrimaryKey=false)
	private String Emp_Id;
	
	@EmployeeField(name="Emp_Email",type=String.class,isPrimaryKey=true)
	private String Emp_Email;
	
	@EmployeeField(name="Emp_Email",type=String.class,isPrimaryKey=false)
	private String Emp_Name;
	
	@EmployeeField(name="Emp_Department",type=String.class,isPrimaryKey=false)
	private String Emp_Department;

	public String getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Id(String emp_Id) {
		Emp_Id = emp_Id;
	}

	public String getEmp_Email() {
		return Emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		Emp_Email = emp_Email;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getEmp_Department() {
		return Emp_Department;
	}

	public void setEmp_Department(String emp_Department) {
		Emp_Department = emp_Department;
	}
	
}

public class Employee_Main_Annotaion {
	
	
	public static void main(String[] args)throws Exception {
		
		EmployeeDetails emp_details=new EmployeeDetails();
		emp_details.setEmp_Name("Sagar Kalthiya");
		emp_details.setEmp_Department("SomwWhere");
		emp_details.setEmp_Email("Demo@demo.com");
		emp_details.setEmp_Id("9512357");

		 
		 
		 for (Field f:emp_details.getClass().getDeclaredFields()) {
			 EmployeeField column = f.getAnnotation(EmployeeField.class);
			   if (column != null) {
				   System.out.println("field name "+ column.name());	
					 System.out.println("field value "+column );
					 System.out.println("field type "+ column.type());
					 System.out.println("field isPrimaryKey "+ column.isPrimaryKey());
					 System.out.println();
			   }else { 
				   System.out.println("demo");
				   }
			   
		 }
	}

}
