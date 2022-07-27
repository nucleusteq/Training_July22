package Exception;

import java.util.Scanner;

public class ArithmeticEx{

	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the value of a:" );
			int a = sc.nextInt();
			System.out.println("Enter the value of :b");
			int b = sc.nextInt();
			try {
			int c = (a/b);
			System.out.println(c);
			}
			catch (ArithmeticException e) {
				System.out.println("Divide by zero exception occured");
			}

		}
	}