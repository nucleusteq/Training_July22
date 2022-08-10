
package JavadocPractice;
import java.util.*;
/**This program will check if entered number is a palindrome number or not.
 * @author Shantanu Kale
 * @version 27/07/2022
 * @since 11/07/2022
 * @see <a href=https://en.wikipedia.org/wiki/Palindromic_number">Palindrome number</a> 
 */
public class Javadoc1 {
	/**
	 * @param args for main method
	 */
	public static void main(String args[])
    {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
     int sum = 0, r;
	 int temp = n;    
     while(n>0)
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(temp==sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
      in.close();
     } 

}
