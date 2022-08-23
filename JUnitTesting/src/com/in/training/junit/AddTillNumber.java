package com.in.training.junit;

public class AddTillNumber {
	public String add (Integer num) {
		
		if(num == 0)
			return"Value should not be zero";
		if(num<0)
			return "Value should not be less than 1 ";
		int sum=0;
		for(int i=num;i>=1;i--)
		{
			sum+=i;
		}
		return sum+"";
	}
	
	public static void main(String...args) {
		AddTillNumber add=new AddTillNumber();
		System.out.println(add.add(4));
	}
	
}