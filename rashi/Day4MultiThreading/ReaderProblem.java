package com.nuc;

public class ReaderProblem extends Thread{

	public void run() {
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			System.out.println(e);
			
		}
		
		System.out.println("Studennt Thread ID:"+Thread.currentThread().getId()+""+Thread.currentThread().getName()+" Output: "+ ReaderWriterProblem.data);

	}
	
}
