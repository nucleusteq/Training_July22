//Program to check if a thread is running or not.
public class RunningThreads extends Thread{
	public void run() {
		System.out.println("This thread "+Thread.currentThread().getName()+"'s alive status is "+Thread.currentThread().isAlive());
	}
	public static void main(String[] args)throws Exception {
		RunningThreads rt1 = new RunningThreads();
		RunningThreads rt2 = new RunningThreads();
		RunningThreads rt3 = new RunningThreads();
		RunningThreads rt4 = new RunningThreads();
		RunningThreads rt5 = new RunningThreads();
		
		rt1.start();
		rt2.start();
		System.out.println(rt3.isAlive());
		rt2.sleep(3000);
		System.out.println(rt2.isAlive());
	}
}