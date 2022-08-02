import java.util.Scanner;
/**
 * 
 * @author aayushi
 * @since 2022
 * @
 * 
 * 
 */


public class array {
	
		public static void main(String[] args) {
			
			int[] Array = new int[5];
			Scanner obj = new Scanner(System.in);
			for (int i=0;i<5;i++) {
			System.out.println("Enter Five Numbers");
			Array[i] =obj.nextInt();
	        }
			System.out.println("Array elements are: ");  
			// accessing array elements using the for loop  
			for (int i=0; i<5; i++)   
			{  
			System.out.println(Array[i]);  
			}  
	        
			//taking input from user
	       System.out.println("Enter any index 1: "); 
	       int index1 = obj.nextInt();
	       
	       System.out.println("Enter any index 2: "); 
	       int index2 = obj.nextInt();
	       
	       try {
	           System.out.println("Division of Elements is:"+Array[index1]/Array[index2]);
	           }
	           catch(ArrayIndexOutOfBoundsException e){
	        	   System.out.println("index out of bound: "); 
	           }
	           catch(ArithmeticException e){
	        		System.out.println("A Number cannot be divided by Zero");  
	        	    }

	    }
	    }