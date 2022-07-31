package com.nuc;

import java.util.Scanner;
public class Merge_fibonacci_reverse_sum{


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
		FibonacciSeries F1 = new FibonacciSeries(num);
		F1.start();
		ReverseList R1= new ReverseList(num);
		R1.start();
		SumThread S1= new SumThread(num);
		S1.start();
		System.out.println("The simultaneous Thread is");
	
	}

}
