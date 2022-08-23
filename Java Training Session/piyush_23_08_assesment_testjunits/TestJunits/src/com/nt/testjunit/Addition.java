package com.nt.testjunit;

import java.util.Scanner;

public class Addition {
	@SuppressWarnings("unused")
	public String sumOfNatural(Integer a) {
		if(a==null) {
			return "value is null";
		}
		if(a<0) {
			return "value is negative";
		}
		
	int sum=0;
	for(int i=1;i<=a;i++) {
	sum=sum+i;
	}
	System.out.println("the sum is " +sum);											
	return sum+"";
	}
}
