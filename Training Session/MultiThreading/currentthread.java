package CreateThread;

class currthread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().hashCode());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(Thread.currentThread().getClass());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().getStackTrace());
	}
} 

public class currentthread {
public static void main(String[] args) throws InterruptedException {
	currthread curr = new currthread();
	Thread ct = new Thread(curr);
	ct.start();	
	ct.setName("thread1");
	
	}
}
