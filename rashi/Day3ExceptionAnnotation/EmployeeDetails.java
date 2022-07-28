package errorexceptiontraining;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface EmployeeField{
	String name();
	Class<?> type();
	boolean isPrimaryKey();}

public class EmployeeDetails {
	public static void main(String[] args) throws Exception {
		
		EmployeeDetails2 empd = new EmployeeDetails2();
		empd.setname("Rashi Jain");
		empd.setdepartment("Maths");
		empd.setemailAddress("rashi.jain@nucleusteq.com");
		empd.setemployeeid("12345");
		
		for (Field field : empd.getClass().getDeclaredFields()) {
            EmployeeField efield = field.getAnnotation(EmployeeField.class);
            System.out.println("field name: " + efield.name());
  
            // changed the access to public
            field.setAccessible(true);
            Object value = field.get(empd);
            System.out.println("field value: " + value);
            System.out.println("field type: " + efield.type());
            System.out.println("is primary: " + efield.isPrimaryKey());
            System.out.println();
            
		}
	}
}

class EmployeeDetails2{
		
		@EmployeeField(name = "name", type =String.class, isPrimaryKey= false)
		private String name;
		@EmployeeField(name = "employeeid", type =String.class, isPrimaryKey= true)
		private String employeeid;
		@EmployeeField(name = "department", type =String.class, isPrimaryKey= false)
		private String department;
		@EmployeeField(name = "emailAddress", type =String.class, isPrimaryKey= false)
        private String emailAddress;
        
        
        public String getname() {
        	return name;
        }
        public void setname(String name) {
        	this.name = name;
        }
        
        
        public String getemployeeid() {
        	return employeeid;
        }
        public void setemployeeid(String employeeid) {
        	this.employeeid = employeeid;
        }
        
        
        public String getdepartment() {
        	return department;
        }
        public void setdepartment(String department) {
        	this.department = department;
        }
        
        
        public String getemailAddress() {
        	return emailAddress;
        }
        public void setemailAddress(String emailAddress) {
        	this.emailAddress = emailAddress;
        }
        
	}


