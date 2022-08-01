package Multithreading;

public class NameOfThread extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		NameOfThread t1=new NameOfThread();
		NameOfThread t2=new NameOfThread();
		NameOfThread t3=new NameOfThread();
		NameOfThread t4=new NameOfThread();
		
		System.out.println("Name of t1: "+t1.getName());
		System.out.println("Name of t2: "+t2.getName());
		System.out.println("Name of t3: "+t3.getName());
		System.out.println("Name of t4: "+t4.getName());
		
		
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     
     
     t1.setName("First Thread");
     t2.setName("Second Thread");
     t3.setName("Third Thread");
     t4.setName("Fourth Thread");
     System.out.println("After changing name of t1:" +t1.getName());
     System.out.println("After changing name of t2:" +t2.getName());
     System.out.println("After changing name of t3:" +t3.getName());
     System.out.println("After changing name of t4:" +t4.getName());
     
	}

}
