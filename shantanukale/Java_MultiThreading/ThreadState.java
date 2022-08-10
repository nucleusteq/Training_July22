
public class ThreadState extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
	}

public static void main(String[] args) throws InterruptedException {
	ThreadState ts1 = new ThreadState();
	ts1.setName("First Thread");
	System.out.println(ts1.getName()+" "+ts1.getState());
	ts1.start();
	try {
	Thread.sleep(3000);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	ts1.sleep(5000);
	System.out.println(ts1.getName()+" "+ts1.getState());
}
}