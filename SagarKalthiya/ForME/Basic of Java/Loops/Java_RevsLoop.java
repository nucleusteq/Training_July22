package Loops;
import java.util.*;

public class Java_RevsLoop {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int revnum=0, t;
		while(num!=0) {
			t = num%10;  
			revnum = revnum * 10 + t;  
			num = num/10;
		}
		System.out.println("Reverse number is "+revnum);
	
	}
}
