import java.util.Scanner;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        
    	Scanner myObj = new Scanner(System.in);
    	
    	System.out.println("Enter any Integer Value:");
    	int var = myObj.nextInt();
    	
    	System.out.println("Value of integer after post-increment:");
        System.out.println(var++);

        System.out.println("Value of integer after pre-increment:");
        System.out.println(++var);
        
    	System.out.println("Value of integer after post-decrement:");
        System.out.println(var--);

        System.out.println("Value of integer after pre-decrement:");
        System.out.println(--var);
    }
}