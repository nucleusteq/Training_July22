package MultiThreading;

public class ShowRunningThread extends Thread{
	public void run() {
		System.out.println("This thread "+Thread.currentThread().getName()+"'s alive status is "+Thread.currentThread().isAlive());
	}
	public static void main(String[] args)throws Exception {
		ShowRunningThread t1 = new ShowRunningThread();
		ShowRunningThread t2 = new ShowRunningThread();
		ShowRunningThread t3 = new ShowRunningThread();
		ShowRunningThread t4 = new ShowRunningThread();
		ShowRunningThread t5 = new ShowRunningThread();
		
		t1.start();
		t2.start();
		System.out.println(t3.isAlive());
		t2.sleep(1000);
		System.out.println(t2.isAlive());
	}
}
