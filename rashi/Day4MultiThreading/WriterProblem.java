package com.nuc;

import java.util.Scanner;
public class WriterProblem extends Thread{
    //static String data;
	public WriterProblem() {
		
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Something:");
		String data=sc.nextLine();
		ReaderWriterProblem.data = data;
		System.out.println("Teacher Thread ID: "+Thread.currentThread().getId()+Thread.currentThread().getName()+"is written Successfully");
		sc.close();
	}
}


