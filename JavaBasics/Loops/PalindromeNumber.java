import java.util.Scanner;
class PalindromeNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int reverseNum=0;
		while(temp>0){
			int r=temp%10;
			reverseNum=reverseNum*10+r;
			temp=temp/10;
		}
		
		if(num == reverseNum){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not A Palindrome Number");
		}
	}
}