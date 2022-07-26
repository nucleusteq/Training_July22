import java.util.*;
public class ReversingNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int revnum=0, t;
		while(num!=0) {
			t = num%10;  
			revnum = revnum * 10 + t;  
			num = num/10;
		}
		System.out.println("Reverse number is "+revnum);
	
	}

}
