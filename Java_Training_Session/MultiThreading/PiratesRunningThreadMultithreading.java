package MultiThreading;
import java.util.Random;
public class PiratesRunningThreadMultithreading extends Thread {
	
	public PiratesRunningThreadMultithreading(ThreadGroup tg,String name) {
		super(tg,name);
	}
	
	
	public void run() {
		Random random=new Random();
		int location=random.nextInt(5);
		while(location !=4 ) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			//System.out.println(Thread.currentThread().getName()+" Treasure Not Found");
			location=random.nextInt(5);
		}
		System.out.println(Thread.currentThread().getName()+" Treasure Found");
		
	}
}
