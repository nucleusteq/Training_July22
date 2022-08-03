package com.nuc;

public class ReverseList extends Thread
{
	int num;
	ReverseList(int num){

		this.num = num;
	}
	public void run() 
	{
		System.out.println("Reversing list is ");
		 int FirstTerm = 0, SecondTerm = 1;
		    System.out.println("Reverse List is:");
		    for(int i=num; i>=0; i--) 
		    {
		    	System.out.println("Reverse Series Number: " +i);
	}	        
		    
		    }  
		}