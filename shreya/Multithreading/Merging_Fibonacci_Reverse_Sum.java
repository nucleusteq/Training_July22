package Multithreading;
import java.util.*;

public class Merging_Fibonacci_Reverse_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
			FibonacciSeries F1 = new FibonacciSeries(num);
			F1.start();
			ReverseList R1= new ReverseList(num);
			R1.start();
			ThreadSum S1= new ThreadSum(num);
			S1.start();
			System.out.println("The simultaneous Thread is");
		
		}

	}
