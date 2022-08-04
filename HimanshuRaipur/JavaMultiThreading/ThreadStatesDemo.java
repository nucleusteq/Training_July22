package MultiThreading;
//import java.time.LocalDateTime;  


class ThreadState extends Thread{
	public void run() {
		Thread.currentThread().setName("State Demonstration Thread");
		    System.out.println("2. "+Thread.currentThread().getName()+" "+Thread.currentThread().getState());
		    for(int i=0;i<=10;i++) {
		    	System.out.println(i);
		    	try {
			    	Thread.sleep(100);	
			    }
			    catch(Exception e) {
			    	System.out.println(e);
			    }
		    }
		    try {
		    	//System.out.println("Before sleep 2 "+java.time.LocalTime.now());
		    	Thread.sleep(6000);
		    	//System.out.println("After sleep 2 "+java.time.LocalTime.now());
		    }
		    catch(Exception e) {
		    	System.out.println(e);
		    }
	}
}
public class ThreadStatesDemo {
		
	public static void main(String[] args)throws Exception {
		ThreadState ts=new ThreadState();
		System.out.println("1. "+ts.getName()+" "+ts.getState());
		ts.start();
		//System.out.println("Before sleep 1 "+java.time.LocalTime.now());
		Thread.sleep(5000);
		//System.out.println("After sleep 1 "+java.time.LocalTime.now());
		System.out.println("3. "+ts.getName()+" "+ts.getState());
		Thread.sleep(3000);
		System.out.println("4. "+ts.getName()+" "+ts.getState());
	}

}