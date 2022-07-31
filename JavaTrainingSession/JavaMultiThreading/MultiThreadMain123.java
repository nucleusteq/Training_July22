package JavaTrainingSession.JavaMultiThreading;
import java.util.Scanner;

class FiboThread extends Thread{
	
	private int n;
	
	FiboThread(int Come)
	{
		this.n=Come;
	}
	
	public void run()
	{
		MultiThread1.Fibo(n);
	}
}
class ReverseThread extends Thread{
	
	private int n;
	
	ReverseThread(int Come)
	{
		this.n=Come;
	}
	public void run()
	{
		MultiThread3.digitSum(n);
	}
}
class SumThread extends Thread{
	
	private int n;
	
	SumThread(int Come)
	{
		this.n=Come;
	}
	public void run()
	{
		MultiThread2.reverse(n);
	}
}
public class MultiThreadMain123 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Integer to get 3 three outputs - ");
		n=sc.nextInt();
		
		FiboThread man1 = new FiboThread(n);
		man1.setPriority(Thread.MAX_PRIORITY);
		man1.setName("Fibo Thread");
		System.out.println("\nPirority of thread "+man1.getName()+" : "+man1.getPriority());
		
		ReverseThread man2 = new ReverseThread(n);
		man2.setPriority(Thread.NORM_PRIORITY);
		man2.setName("Reverse Thread");
		System.out.println("Pirority of thread "+man2.getName()+" : "+man2.getPriority());
		
		SumThread  man3 = new SumThread(n);
		man3.setPriority(Thread.MIN_PRIORITY);
		man3.setName("Sum Thread");
		System.out.println("Pirority of thread "+man3.getName()+" : "+man3.getPriority());
		
		man1.start();
		man2.start();
		man3.start();		
		
		sc.close();
	}
}
