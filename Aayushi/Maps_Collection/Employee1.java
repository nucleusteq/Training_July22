import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
public class Employee1 {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		LinkedHashMap<String,Integer> LHmap = new LinkedHashMap<String,Integer>();
		LHmap.put( "Aayushi Gopawar",1001);
		LHmap.put("Aashi Agrawal",1002);
		LHmap.put( "Vanshika Saigal",1003);
		LHmap.put("Reena Anthony",1004);
		LHmap.put("Anshu Yadav",1005);
		
	 
     for(Entry<String,Integer> entry : LHmap.entrySet()) {
    	 System.out.println("Enter the name to get employee ID:");
    	 String name= sc.nextLine();
     	System.out.println("Get Key:"+ LHmap.get(name));
		
     }
		
		
}}

