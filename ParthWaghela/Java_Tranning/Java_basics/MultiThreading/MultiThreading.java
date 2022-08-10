class Thread3 extends Thread{
	public void run() {
		 for (int i =1 ; i<=3 ; i++) {
			   System.out.println("Thread 3 is running");
		   }; 
		   System.out.println("Thread3 end");

	}
}
class Thread2 extends Thread {
	public void run() {
		 for (int i =1 ; i<=5 ; i++) {
			   System.out.println("Thread 2 is running");
		   }; 
		   System.out.println("Thread2 end");
	}
}
public class MultiThreading extends Thread{
	 public void run() {
		   for (int i =1 ; i<=5 ; i++) {
			   System.out.println(
		                "Thread 1 is running");
		   };
		   System.out.println("Thread1 end");
	   }
   public static void main(String args[]) {
	   MultiThreading T1=new MultiThreading();
	   T1.start();
	   Thread2 T2= new Thread2();
	   T2.start();  
	   Thread3 T3 =new Thread3();
	   T3.start();
   }
}
