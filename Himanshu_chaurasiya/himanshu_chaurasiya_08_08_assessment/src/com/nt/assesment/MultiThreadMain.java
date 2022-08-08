

/*
 * INcomplete , and didnt got the concept to do it .
 */

package com.nt.assesment;
import java.util.Scanner;

class Thread1 extends Thread{
	
	private String n;
	
	Thread1()
	{
		String data;
		Scanner sc=new Scanner(System.in);
		data=sc.next();
		this.n=data;
	}
	
	public void run()
	{
		System.out.println(n);
	}
}

public class MultiThreadMain {
	public static void main(String[] args) {
		

		Thread1 t1 = new Thread1();
		t1.setName(" First Thread");
		System.out.println("\nName of Thread "+t1.getName()+" ");
		
		Thread1 t2 = new Thread1();
		t2.setName(" Second Thread");
		System.out.println("\nName of thread "+t2.getName()+" ");
		
		Thread1 t3 = new Thread1();
		t3.setName(" Third Thread");
		System.out.println("\nName of thread "+t3.getName()+" ");
		
		Thread1 t4 = new Thread1();
		t4.setName(" Fourth Thread");
		System.out.println("\nName of thread "+t4.getName()+" ");
		
		Thread1 t5 = new Thread1();
		t5.setName(" Fifth Thread");
		System.out.println("\nName of thread "+t5.getName()+" ");
		
		Thread1 t6 = new Thread1();
		t6.setName(" Sixth Thread");
		System.out.println("\nName of thread "+t6.getName()+" ");
		
		Thread1 t7 = new Thread1();
		t7.setName(" Seventh Thread");
		System.out.println("\nName of thread "+t7.getName()+" ");
		
		Thread1 t8 = new Thread1();
		t8.setName(" Eighth Thread");
		System.out.println("\nName of thread "+t8.getName()+" ");
		
		Thread1 t9 = new Thread1();
		t9.setName(" Nineth Thread");
		System.out.println("\nName of thread "+t9.getName()+" ");
		
		Thread1 t10 = new Thread1();
		t10.setName(" Tenth Thread");
		System.out.println("\nName of thread "+t10.getName()+" ");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
