package JavaTrainingSession.JavaException;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface EmployeeField{
	String name();
	Class< ?> type();
	boolean isPrimaryKey();
	}


public class EmployeeCode {
	public static void main(String[] args) throws Exception {
		EmployeeDetails emp = new EmployeeDetails("himanshu",12,"MCA","hey@gmail.com");
		
		for(Field field:emp.getClass().getDeclaredFields()) {
			EmployeeField efield=field.getAnnotation(EmployeeField.class);
			System.out.println("field name "+ efield.name());	
			 field.setAccessible(true);
			Object value=field.get(emp);
			 System.out.println("field value "+value );
			 System.out.println("field type "+ efield.type());
			 System.out.println("field isPrimaryKey "+ efield.isPrimaryKey());
			 System.out.println("*****************");		
		}
	}
}

class EmployeeDetails{	
	@EmployeeField(name="employee_name",type=String.class, isPrimaryKey=false)
	private String employee_name;
	
	@EmployeeField(name="id",type=String.class, isPrimaryKey= true)
	private int id;
	
	@EmployeeField(name="department",type=String.class, isPrimaryKey=false)
	private String department;
	
	@EmployeeField(name="email",type=String.class, isPrimaryKey=false)
	private String email;

	
	public EmployeeDetails(String name, int id,String department , String email)
	{
		this.employee_name = name;
		this.id = id;
		this.department = department;
		this.email = email;
	}
	
	String getName()
	{
		return employee_name;
	}
	int getId()
	{
		return id;
	}
	String getDepartment()
	{
		return department;
	}
	String getEmail()
	{
		return email;
	}
}

