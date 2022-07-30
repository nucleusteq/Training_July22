package Exeption_Handling;
import java.util.*;

public class First_program {
	
	public static void method_demo() {
		System.out.println("Enter a Number b 1");
		method_demo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a Array Size a :- ");
		//int n = sc.nextInt();
		/*System.out.println("Enter a Number b :- ");
		int b = sc.nextInt();
		*/
		try {
			method_demo();
			
		}catch(Throwable e) {
			System.out.println("error solved");
		}
		System.out.println("done ");
		/*int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter a Index No :-");
        int index1 = sc.nextInt();
        System.out.println("Enter a Index 2nd No :- ");
        int index2 = sc.nextInt();
       try {
    	   for (int i = 0; i < n; i++) {
          	 System.out.println("Element at index " + i + " : " + arr[i]);
          	 
            }     
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nException caught" + e);
        }
           
    
		/*try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("A Number can not be divided By Zero");
		}
		*/

	}

}
