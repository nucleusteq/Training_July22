package Mythread;
import java.util.Scanner;
class Fibonacci extends Thread{
	int n;
	Fibonacci(int n){
		this.n=n;}

	public void run() {
		try {
			Thread.sleep(1000);
			int n1=0,n2=1,n3=1;
			System.out.println("The fibonacci series:");
			for(int i=0;i<n;i++)
			{ n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.println(n3);
			}
		}
		catch(Exception e)
		{System.out.println(e);}
	}
}
	class Sum extends Thread{
		int n;
		Sum(int n){
			this.n=n;
		}
		public void run() {
			try { Thread.sleep(1000);
				int sum=0;
				for(int i=0;i<=n;i++)
				{ sum+=i;
				}
				System.out.println("The sum of elements is" +sum);
			}
			catch(Exception e)
			{System.out.println(e);}

		}
	} 
	
	class Reverse extends Thread{
		int n;
		Reverse(int n){
			this.n=n;
		}
		public void run() {
			 try{for(int i=n;i>=0;i--) {
				Thread.sleep(1000);
				 System.out.println("Reverse of elements are"+i );
			}}
			 catch(Exception e)
			 {System.out.println(e);
			 }
		}
	}
		
		class Multitask{
			public static void main(String args[])
			{Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements");
			int n=sc.nextInt();
			Sum t1=new Sum(n);
			t1.start();
			Fibonacci t2=new Fibonacci(n);
			t2.start();
			
			Reverse t3=new Reverse(n);
			t3.start();
			sc.close();


		
		}
	
		}


