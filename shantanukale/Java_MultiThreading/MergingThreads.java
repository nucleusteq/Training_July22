class Fibonacci extends Thread{
	public void run() {
		int no1=0 ,no2=1,no3=1;
		System.out.println("Printing fibonacci series : ");
		for(int i=0;i<10;i++) {
			System.out.println(no3);
			no3=no1+no2;
			no1=no2;
			no2=no3;
	}
}
}
class Reverse extends Thread{
	public void run() {
		System.out.println("Printing reverse numbers :");
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
	}
}
class Sum extends Thread{
	public void run() {
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum = sum+i;
		}
		System.out.println("First 10 number's sum : "+sum);
	}
}
public class MergingThreads{
	public static void main(String[] args) {
		Fibonacci F = new Fibonacci();
		F.start();
		Reverse R = new Reverse();
		R.start();
		Sum S = new Sum();
		S.start();
	}
}