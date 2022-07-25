import java.util.*;
public class multitable {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print it's table: ");
        int num = scan.nextInt();
        int prod=1;
        for (int i=1; i<=10; i++) {
        	System.out.println(num + " * "+ i + " = "+ num*i);
        }
    }
}