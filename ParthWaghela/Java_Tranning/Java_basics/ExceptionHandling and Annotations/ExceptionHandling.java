import java.util.*;
public class ExceptionHandling {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			try {
				int c =(x/y);
				System.out.print("value of c ; " +c);
			}
			catch(ArithmeticException e){
				System.out.println("Number cannot divided by 0");
			}
		}	
	}
}
