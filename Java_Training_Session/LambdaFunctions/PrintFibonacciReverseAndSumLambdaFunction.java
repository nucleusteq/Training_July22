package LambdaFunctions;

import java.util.Scanner;

public class PrintFibonacciReverseAndSumLambdaFunction {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Runnable fibonacciSeries=()->{
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

		};

		Runnable printReverse=()->{
			System.out.println("Reverse List :");
			for(int i=num;i>=0;i--) {
				System.out.println("Reverse List : "+i);
			}	
		};
		
		Runnable sumOfNNumbers=()->{
			int sum=0;
			for(int i=1;i<=num;i++) {
				sum+=i;
			}
			System.out.println("Sum Of N Numbers: "+sum);
		};
		
		new Thread(fibonacciSeries).start();
		new Thread(sumOfNNumbers).start();
		new Thread(printReverse).start();
		
		sc.close();	
	}

}
