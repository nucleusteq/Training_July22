package com.nuc;

public class SumThread extends Thread{
	int num;
	SumThread(int num){

		this.num = num;
	}
    public void run() {
    	System.out.println("The sum is ");
    	num=0;
		int sumofnum;
		
	   for(int i=1; i<=10;i++){
	   num=num+i;
			
		}
	   System.out.println("Sum of 10 Numbers is:" +num);
    }

}
