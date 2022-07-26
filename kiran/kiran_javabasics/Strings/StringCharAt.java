
	import java.util.Scanner;
	public class StringCharAt{

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter any String: ");
			String str=sc.nextLine();
			System.out.println(str.charAt(str.length()-2));//prints second last character of string
		}
	}

