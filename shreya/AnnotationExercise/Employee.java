package AnnotationExercise;

class EmployeeDetails{
	@EmployeeField (name = "EmpName", type = "String", isPrimaryKey = false)
	String EmpName;
	@EmployeeField (name = "EmpId", type = "Int", isPrimaryKey = true)
	int EmpId;
	@EmployeeField (name = "Dept", type = "String", isPrimaryKey = false)
	String Dept;
	@EmployeeField (name = "EmailAdd", type = "String", isPrimaryKey = false)
	String EmailAdd;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getEmailAdd() {
		return EmailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		EmailAdd = emailAdd;
	}
}
public class Employee{
	public static void main(String[] args) {
		
		EmployeeDetails e= new EmployeeDetails();
		e.setEmpName("Shreya Punjabi");
		e.setEmpId(12345);
		e.setDept("Software Department");
		e.setEmailAdd("s.pun@gmail.com");
		
	}	
}
