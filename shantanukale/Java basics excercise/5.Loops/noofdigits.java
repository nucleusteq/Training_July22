import java.util.*;
public class noofdigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = scan.nextLong();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits is "+count);
	}

}
