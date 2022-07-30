package Introduction.Loops;
import java.util.*;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of numbers "+num+" is "+sum);

	}

}
