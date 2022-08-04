public class StringEqualsIgnoreCase{

	public static void main(String[] args){
		String s1="himanshu";  
		String s2="himanshu";  
		String s3="HIMANSH";  
		String s4="Himanshu";  
		System.out.println(s1.equalsIgnoreCase(s2));//prints true as contents of both strings are same.
		System.out.println(s1.equalsIgnoreCase(s3));//prints false as contents of both the string are not same and ignore its  case 
		System.out.println(s1.equalsIgnoreCase(s4));//prints true as contents of both strings are same.

	}
}