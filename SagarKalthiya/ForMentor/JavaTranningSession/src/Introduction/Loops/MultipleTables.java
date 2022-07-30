package Introduction.Loops;
import java.util.*;

public class MultipleTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print a table :- ");
        int num = sc.nextInt();
        int prod=1;
        for (int i=1; i<=10; i++) {
        	System.out.println(num + " * "+ i + " = "+ num*i);
        }
	}

}
