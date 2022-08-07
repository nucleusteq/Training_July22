import java.lang.Thread;
class Thread1f extends Thread{
	private int a;
	public Thread1f(int a) {
		this.a=a;
	}
	public void run() {
		int first=0,second=1,next;
	//	System.out.print(first +" "+ second );
		for(int i=2;i<=a;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.println( " "+next);
			
		}
	//  	System.out.println("This is a fibonacci thread");
	}
}
class Thread2r extends Thread{
	private int a;
	public Thread2r(int a) {
		this.a=a;
	}
	public void run() {
		for(int i=a;i>=0;i--) {
			System.out.println(i);
		}
	//	System.out.println("this is the reverse thread" );
	}
}
class Thread3s extends Thread{
	private int a;
	public Thread3s(int a) {
		this.a=a;
	}
	public void run() {
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum = sum+i;
		}
		System.out.println("the sum is " +sum);
	}
	
}
public class ThreadExample3 {
	public static void main(String[] args) throws InterruptedException
	{
		Thread1f f =new Thread1f(10);
		Thread2r r =new Thread2r(10);
		Thread3s s =new Thread3s(10);
		f.start();
		r.start();
		Thread.sleep(1000);
		s.start();
		Thread.sleep(3000);
		
		try {
		     Thread.sleep(10000);
		} catch (InterruptedException e) {
		      System.out.println("Main thread Interrupted");
		}
		      System.out.println("Main thread exiting.");
		      }
		
	}


