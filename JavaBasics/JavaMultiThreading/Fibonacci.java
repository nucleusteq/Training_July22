package MultiThreading;

public class Fibonacci extends Thread{
	int num;
	FibonacciSeries(int num){
		this.num=num;
	}
	public void run() {
		int temp=0;
		int temp1=1;
		System.out.println("Fibonacci Series :");
		System.out.println("Fibonacci Element: "+temp);
		System.out.println("Fibonacci Element: "+temp1);
		int sum=temp1;
		for(int i=2;i<num;i++) {
			sum=temp+temp1;
			System.out.println("Fibonacci Element: "+sum);
			temp=temp1;
			temp1=sum;
		}
	}
	
}