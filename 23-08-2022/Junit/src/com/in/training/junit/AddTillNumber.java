package com.in.training.junit;


public class AddTillNumber {
	public static void main(String[] args){
       System.out.println(new AddTillNumber().add(4));
	}
	
	public String add(Integer a) {
		if(a==0) {
			return "Value cannot be zero";
		}
		if(a==null) {
			return "Value cannot be null";
		}
		if(a<0) {
			return "Value cannot be less than zero";
		}
		int sum =0;
		for (int i=a;i>=1;i--) {
	       	sum += i;
	       }
		return "Addition: "+sum;
	}
}
