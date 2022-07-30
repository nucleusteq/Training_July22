import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.reflect.Field;

public class Employee {
public static void main(String args[])throws Exception { {
	EmployeeDetails ed = new EmployeeDetails();
	ed.setName("Vanshika");
	ed.setEmId(3);
	ed.setDepartment("Technical");
	ed.setEmail("employee3@gmail.com");
	for( Field field: ed.getClass().getDeclaredFields())
	{
	EmployeeField employeefield  = field.getAnnotation(EmployeeField.class);
	System.out.println("field name" + "\t" + employeefield.name() );
	
	
	field.setAccessible(true);
	Object value = field.get(ed);
	System.out.println("field value:"+ "\t" + value);
	
	
        System.out.println("field type: " +"\t" + employeefield.type()  );
        System.out.println("field isPrimarykey: " +"\t" + employeefield.isPrimaryKey()  );
        
       }
	System.out.println();
	
}
}}
<<<<<<< HEAD

=======
>>>>>>> 2481e7be7de025e076a5ec45f8f1382d0b0eb839
