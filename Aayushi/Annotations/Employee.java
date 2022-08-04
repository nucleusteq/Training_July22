import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.reflect.Field;


public class Employee {


	public static void main(String[] args) throws Exception {
	
		System.out.println();
		
		EmployeeDetails ed= new EmployeeDetails();
		ed.setName("aayushi");
		ed.setEmId(6);
		ed.setDepartment("tech");
		ed.setEmail("aayushi.com");
		
		for( Field field: ed.getClass().getDeclaredFields())
		{
		EmployeeField employeefield  = field.getAnnotation(EmployeeField.class);
		System.out.println("field name" + "\t" + employeefield.name() );
		
		
		field.setAccessible(true);
		Object value = field.get(ed);
		System.out.println("field value"+ "\t" + value);
		
		
	        System.out.println("field type: " +"\t" + employeefield.type()  );
	        System.out.println("field isPrimarykey: " +"\t" + employeefield.isPrimaryKey()  );
	        
	       }
		System.out.println();
		
	}


	}
