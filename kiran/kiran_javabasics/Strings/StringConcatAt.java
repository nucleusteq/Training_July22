
	import java.util.Scanner;
	public class StringConcatAt{

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter First Name: ");
			String firstName=sc.next();
			System.out.print("Enter Last Name: ");
			String lastName=sc.next();

			System.out.println("Full Name: "+firstName.concat(" ").concat(lastName));// it will print concatinated string 

		}
	}
