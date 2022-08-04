<<<<<<< HEAD
package Maps;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {

	
	public static void main(String[] args) {
		HashMap <Integer,String> hm= new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number :");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+ "th EmployeeID ");
			int a= sc.nextInt();
			System.out.println("Enter Employee Name :");
			String s= sc.next();
			
			hm.put(a, s);
			System.out.println("EmployeeId is " +a+ " Employee Name is " +s);
			
			
		}
		System.out.print("Enter Employee Name to find ID :");
		String st= sc.next();
		
		for(Entry<Integer,String> entry : hm.entrySet()) {
			if(entry.getValue().equals(st)) {
				System.out.println("The Key for value " + st+ "is " +entry.getKey());
				break;
			}
			
			
		}
		

	}

}
=======
package Maps;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee {

	
	public static void main(String[] args) {
		HashMap <Integer,String> hm= new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number :");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+ "th EmployeeID ");
			int a= sc.nextInt();
			System.out.println("Enter Employee Name :");
			String s= sc.next();
			
			hm.put(a, s);
			System.out.println("EmployeeId is " +a+ " Employee Name is " +s);
			
			
		}
		System.out.print("Enter Employee Name to find ID :");
		String st= sc.next();
		
		for(Entry<Integer,String> entry : hm.entrySet()) {
			if(entry.getValue().equals(st)) {
				System.out.println("The Key for value " + st+ "is " +entry.getKey());
				break;
			}
			
			
		}
		

	}

}
>>>>>>> 7d9c3849eabb7c940c682fcf6f99285f8b0e60a1
