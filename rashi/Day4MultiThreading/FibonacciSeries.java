package com.nuc;

public class FibonacciSeries extends Thread{
	int n;
	FibonacciSeries(int n){

		this.n = n;
	}
	public void run() {
		
		  System.out.println("Fibonacci series");
		  int FirstTerm = 0, SecondTerm = 1;
		    System.out.println(" My finonacci series is : " +SecondTerm +"\n");
		    for(int i=2; i<=n; i++) {
		    	int nextTerm = FirstTerm + SecondTerm;
		    	System.out.println(" My finonacci series is : " +nextTerm +"\n");
		    	
		        FirstTerm=SecondTerm;
		        SecondTerm=nextTerm;
		    }
	}
	  }  

