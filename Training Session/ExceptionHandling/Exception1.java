package test;

import java.util.Arrays;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Specify the size of array");
		
		int size =sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter in the array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Index number you want to seek");
		int n =sc.nextInt();
		try {
		System.out.println(arr[n]);	
		}
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("invalid index ");
			}
		System.out.println("Your array is : " + Arrays.toString(arr));
		System.out.println("First number you want to divide: ");
		int a = sc.nextInt();
		int divide1=arr[a-1];
		System.out.println("Second number you want to divide with : ");
		int b = sc.nextInt();
		int divide2=arr[b-1];
		
	try {	int c = divide1/divide2;
		System.out.println(c);
		}
	catch (ArithmeticException e)
	{
		System.out.println("cannot divide by 0");
	}
	}
}
