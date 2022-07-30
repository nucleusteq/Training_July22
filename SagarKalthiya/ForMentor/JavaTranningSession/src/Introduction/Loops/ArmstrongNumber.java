package Introduction.Loops;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int sumOfDigits=0;
		while(temp>0){
			int r=temp%10;
			sumOfDigits+=r*r*r;
			temp=temp/10;
		}
		if(num == sumOfDigits){
			System.out.println("is an Armstrong Number");
		}
		else{
			System.out.println("is Not An Armstrong Number");
		}

	}

}
