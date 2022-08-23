package com.in.nucleusTeq.junit;


import java.util.Scanner;
public class Addition {
	public String add (Integer num) {
		if(num == null)
			return"Number cannot be null";
		if(num<0)
			return "Not a valid input";
		int sum=0;
		for(int i=num;i>=1;i--)
		{
			sum+=i;
		}
		return sum+"";
	}
	
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		Addition add=new Addition();
		int value = sc.nextInt();
		System.out.println(add.add(value));
	}
	
}
