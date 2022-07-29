package JavaTrainingSession.JavaMultiThreading;

import java.lang.Thread;

class Normal extends Thread{
	public void run()
	{	
		System.out.println("Thread run method!"+Thread.currentThread().getName());
	}
}


public class RunningMultiThreads {
    public static void main(String[] args) throws Exception{
    	Normal ab1 = new Normal();
    	Normal ab2 = new Normal();
    	Normal ab3 = new Normal();
    	
    	System.out.println(ab1.getState());
    	System.out.println(ab2.getState());
    	System.out.println(ab3.getState());
    	
    	ab1.start();
    	ab2.start();
    	ab3.start();
    	
    	
    	System.out.println(ab3.getState());
    	Thread.sleep(2000);
    	System.out.println(ab3.getState());

    	System.out.println(ab1.getState());
    	System.out.println(ab2.getState());
    	System.out.println(ab3.getState());
	    	
    }
    }
