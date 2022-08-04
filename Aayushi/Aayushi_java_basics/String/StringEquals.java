public class StringEquals{

	public static void main(String[] args){
		String s1="aayushi";  
		String s2="aayushi";  
		String s3="AAYUSHI";  
		String s4="aashi";  
		System.out.println(s1.equals(s2));//prints true as content of both string is same
		System.out.println(s1.equals(s3));//prints false as content of both the string are same but their case is different
		System.out.println(s1.equals(s4));//prints false as content is not same 

	}
}