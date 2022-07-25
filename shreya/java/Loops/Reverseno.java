package Loops;
import java.util.*;
public class Reverseno {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = s.nextInt();
			int revnum=0, t;
			while(num!=0) {
				t = num%10;  
				revnum = revnum * 10 + t;  
				num = num/10;
			}
			System.out.println("Reverse number is "+ revnum);
		
		}

	}