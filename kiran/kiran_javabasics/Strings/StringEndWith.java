

	import java.util.Scanner;
	public class StringEndWith{

		public static void main(String[] args){
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter Mail Id : ");
			String str = sc.next();  
	          
	            if(str.endsWith(".com")) {  
	                 System.out.println("String ends with .com");  
	            }else
			{
				System.out.println("It does not end with .com");  
	    		}  

	
	}

}
