
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
 * Annotation Practice class is used to create an object of Employee Details class.
 * @author ManavJindal
 * @version 0.1
 * @since 0.1
 * {@link EmployeeDetails}
 */
public class AnnotationPractice {
	
	
	public static void main(String[] args)throws Exception {
  
		EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.setEmployeeName("Manav Jindal");
		employeeDetails.setDepartment("Engineering");
		employeeDetails.setEmailAddress("manavjindal@gmail.com");
		employeeDetails.setEmployeeId("12345");
		
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
 * It is a POJO class EmployeeDetails 
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
	/**
	 * @param employeeName : The employee's name
	 * @param employeeId : The employee's unique id
	 * @param department : The department in which employee is working
	 * @param emailAddress : The employee's email id
	 *
	 */
	
	/**
	 * 
	 * Get's the employee name
	 * @return A string representing employee name
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/***
	 * Set's the employee name
	 * @param employeeName : A string containing the employee's name
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	/**
	 * 
	 * Get's the employee id
	 * @return A string representing employee id
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/***
	 * Set's the employee id
	 * @param employeeId : A string containing the employee's id
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	/**
	 * 
	 * Get's the employee department
	 * @return A string representing employee department
	 */
	public String getDepartment() {
		return department;
	}
	/***
	 * Set's the employee department
	 * @param department : A string containing the employee's department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * 
	 * Get's the employee email address
	 * @return A string representing employee email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/***
	 * Set's the employee email address
	 * @param emailAddress : A string containing the employee's email address
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
}