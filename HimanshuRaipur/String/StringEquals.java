public class StringEquals{

	public static void main(String[] args){
		String s1="HIMANSHU";  
		String s2="himanshu";  
		String s3="HIMANSHU";  
		String s4="Himamshu";  
		System.out.println(s1.equals(s2));//prints false as content of both strings is not same.
		System.out.println(s1.equals(s3));//prints true as content of both the strings are same. but their case is different
		System.out.println(s1.equals(s4));//prints false as content of both strings is not same 

	}
}