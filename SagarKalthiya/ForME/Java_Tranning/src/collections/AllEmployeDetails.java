package collections;
import java.util.*;

class Employees{
    int empId ;
    String empName;
    public Employees(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void addEmploye(int empId, String empName) {
		
	}
	 public String toString() {
	        return this.empId + " " + this.empName;
	 }
}

public class AllEmployeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map< Integer, String> m=new HashMap< Integer, String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id :-");
		int Id = sc.nextInt();
		System.out.println("Enter Employee Name :-");
		String Name = sc.nextLine();
		
		//Employees employee1=new Employees(Id,Name);
		m.put(1, "sagar");
		m.put(2, "manav");
		m.put(3, "parth");
		m.put(4, "rashi");
		m.put(5, "sejal");
		m.put(6, "ayush");
		m.putAll(m);
		
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
		    Integer key = entry.getKey();
		    Object value = entry.getValue();
		System.out.println("Value of "+key+" is: "+value);
		}
		
		//m.addAll(m);

	}

}
