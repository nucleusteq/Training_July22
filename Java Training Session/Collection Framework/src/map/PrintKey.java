package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PrintKey {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Piyush");
		hm.put(2,"himanshu");
		hm.put(3, "yuvraj");
		hm.put(4, "poco");
		hm.put(5,"ayush");
		
		System.out.println(hm);
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(6,"sagar");
		hm2.put(7,"prakriti");
		hm2.put(8,"himanshu");
		hm2.put(9,"sejal");
		
		System.out.println(hm2);
		System.out.println(hm.containsKey(3));  // contains method
		
		
		hm.putAll(hm2);  /// to add all the objects
		System.out.println(hm);
		int[] arr=new int[20];
		String Name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name  ");
		Name=sc.next();

		
		
//		
		
			for(Entry<Integer,String> entry:hm.entrySet()) {

					if(Name.equals((entry.getValue()))) {
						System.out.println(entry.getKey());
}				
	
			}
			
		}
	}

