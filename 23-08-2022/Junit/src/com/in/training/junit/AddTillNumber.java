package com.in.training.junit;


public class AddTillNumber {
	public String add (Integer a) {
		if(a == 0)
			return"Number cannot be zero";
		if(a<0)
			return "Value should not be less than zero";
		int sum=0;
		for(int i=a;i>=1;i--)
		{
			sum+=i;
		}
		return sum+"";
	}
	
	public static void main(String args[]) {
		AddTillNumber add=new AddTillNumber();
		System.out.println(add.add(10));
	}
	
}
