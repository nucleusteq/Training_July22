package Annotation;

/**
 * 
 */
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
/**
 * Creating a project to learn about the use of Annotation 
 * @author Ayush
 * aysuh
 *
 */
public class DocTask {
	
	/**
	 * 
	 * providing the values in main method and initiating the annotation  
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args)throws Exception {
		EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.setEmployeeName("Ayush");
		employeeDetails.setEmployeeId("0121");
		employeeDetails.setDepartment("IT");
		employeeDetails.setEmailAddress("abc@gmail.com");
		
		
		for(Field field:employeeDetails.getClass().getDeclaredFields()) {
			EmployeeField efield=field.getAnnotation(EmployeeField.class);
			System.out.println("field name "+ efield.name());	
			 field.setAccessible(true);
			Object value=field.get(employeeDetails);
			 System.out.println("field value "+value );
			 System.out.println("field type "+ efield.type());
			 System.out.println("field isPrimaryKey "+ efield.isPrimaryKey());
			 System.out.println();	
		}
	}
}
/**
 * Providing the getter setter method
 * @author Ayush
 *
 */
class EmployeeDetails{
	@EmployeeField(name="employeeName",type=String.class,isPrimaryKey=false)
	private String employeeName;
	
	@EmployeeField(name="employeeId",type=String.class,isPrimaryKey=true)
	private String employeeId;
	
	@EmployeeField(name="department",type=String.class,isPrimaryKey=false)
	private String department;
	
	@EmployeeField(name="emailAddress",type=String.class,isPrimaryKey=false)
	private String emailAddress;
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}
