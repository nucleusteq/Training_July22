package test;

//@Retention(RetentionPolicy.EmployeeDetails)
//@Target(ElementType.Field)
//
//
//public @interface EmployeeField {
//	String name default " ";
//	String type default " ";
//	Boolean isPrimaryKey default " ";
//}


class EmployeeDetails
{
	String name;
	int id;
	String department;
	String email;
	public EmployeeDetails(String name, int id,String department , String email)
	{
		this.name = name;
		this.id = id;
		this.department = department;
		this.email = email;
	}
	String getName()
	{
		return name;
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


public class Employee {
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails("hari",1,"mca","hari@gmail.com");
		
	}

}
