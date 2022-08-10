package exception;
import java.util.*;
public class newExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Enter number of elements in array: ");
		num = scan.nextInt();
		System.out.println("Enter array elements: ");
		int array[] = new int[num];
		for (int i=0;i<num; i++) {
			array[i]=scan.nextInt();
		}
		System.out.println("Enter 2 index to search: ");
		int search1 = scan.nextInt();
		int search2 = scan.nextInt();
		try {
		System.out.println("Element found "+array[search1]);
		System.out.println("Element found "+array[search2]);
		int z = array[search1]/array[search2];
		System.out.println("Division of elements = "+z);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}
		catch(ArithmeticException ae) {
			System.out.println("Number cannot be divisible by zero");
		//TRY, CATCH, FINALLY BLOCK MARKS THE END OF YOUR PROGRAM. CANNOT RUN ANYTHING AFTER IT.
		}
	}

}
