package Multithreading;

public class ThreadStates extends Thread {
	//Running method
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("This is Thread running state");
		}
		
		//Waiting State
		try{
			System.out.println("Thread is going to sleep");
			ThreadStates.sleep(1000);
			System.out.println("Thread woke up");
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

public static void main(String agrs[]) 
{
	
	ThreadStates t = new ThreadStates();
	//New state
	System.out.println("getstate1"+t.getState());
	t.start();
	
System.out.println("getstate2"+t.getState());
System.out.println("getstate3"+t.getState());
System.out.println("getstate4"+t.getState());
System.out.println("thread Name"+t.getName());
System.out.println("thread Prority"+t.getPriority());
System.out.println("thread State"+t.getState());
}
}