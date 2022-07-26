import java.util.Scanner;
public class StringConcat{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String firstName=sc.next();
		System.out.print("Enter Last Name: ");
		String lastName=sc.next();

		System.out.println("Full Name: "+firstName.concat(" ").concat(lastName));//This will print concatinated string. 

	}
}