package com.nuc;

public class Multithreading extends Thread {
	//Running method
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("This is Thread running state");
		}
		
		//Waiting State
		try{
			System.out.println("Thread is going to sleep");
			Multithreading.sleep(1000);
			System.out.println("Thread wake up");
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

public static void main(String agrs[]) 
{
	
	Multithreading mt = new Multithreading();
	//New state
	System.out.println("getstate1"+mt.getState());
	mt.start();
	
System.out.println("getstate2"+mt.getState());
System.out.println("getstate3"+mt.getState());
System.out.println("getstate4"+mt.getState());
System.out.println("thread Name"+mt.getName());
System.out.println("thread Prority"+mt.getPriority());
System.out.println("thread State"+mt.getState());
}
}