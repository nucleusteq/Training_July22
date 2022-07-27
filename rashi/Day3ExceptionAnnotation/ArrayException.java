package introduction;
import java.util.Scanner;

class ArrayException 
{
public static void main(String args[])
{
	int a[] = new int[5];
	int index;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements:");
			for(int i = 0; i<5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter an index value:");
		index = sc.nextInt();
				try {
					System.out.println("Enter an index value" +index);
				}
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException");
		 }
  }
}

