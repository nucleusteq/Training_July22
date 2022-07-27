public class StringEqualsIgnoreCase{

	public static void main(String[] args){
		String s1="nucleusteq";  
		String s2="nucleusteq";  
		String s3="NUCLEUSTEQ";  
		String s4="nucleus";  
		System.out.println(s1.equalsIgnoreCase(s2));//prints true as content of both string is same
		System.out.println(s1.equalsIgnoreCase(s3));//prints true as content of both the string are same and ignore its  case 
		System.out.println(s1.equalsIgnoreCase(s4));//prints false as content is not same 

	}
}