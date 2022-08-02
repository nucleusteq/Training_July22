package Multithreading;

import java.util.Scanner;

public class WriterThread extends Thread {

	public WriterThread() {

	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Something");
		String data=sc.nextLine();
		ReaderWriter.data=data;
		System.out.println("Teacher Thread Id: "+Thread.currentThread().getId()+" "+Thread.currentThread().getName()+" have written successfully");
		sc.close();
		
	}
}