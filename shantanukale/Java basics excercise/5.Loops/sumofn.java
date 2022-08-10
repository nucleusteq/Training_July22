import java.util.*;
public class sumofn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("Sum of numbers upto "+num+" is "+sum);
	}

}
