package ExeptionHandling;
import java.util.*;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 2, 3,4, 5, 6, 7};
	      System.out.println("Elements in the array are: ");
	      System.out.println(Arrays.toString(myArray));
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the index of the required element: ");
	      int element = sc.nextInt();
	      try {
	    	  System.out.println("Element in the given index is :: "+myArray[element]);
	      }catch(Exception e) {
	    	  System.out.println("Plese Enter Number Between 1 to 7 only");
	      }
	      

	}

}
