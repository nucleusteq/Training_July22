package MultiThreading;

import java.util.Scanner;


public class FibonacciSeriesReverseAndSumOfNNumbers {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Fibonacci fibonacciSeries=new Fibonacci(num);
		ReverseNumber ReverseNumber=new ReverseNumber(num);
		SumOfNNumbers sumOfNNumbers=new SumOfNNumbers(num);
		
		System.out.println(sumOfNNumbers.getName()+" "+sumOfNNumbers.getState());
		fibonacciSeries.start();
		ReverseNumber.start();
		sumOfNNumbers.start();
		//sumOfNNumbers.sleep(1000);
		//System.out.println("DDD"+sumOfNNumbers.getName()+" "+sumOfNNumbers.getState());
		sc.close();
		

	}
