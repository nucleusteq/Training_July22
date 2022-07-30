package Introduction.DataTypes;
import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a no :-  ");
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
