package javabasics4;
import java.util.Scanner;

import day4.reverse;
import day4.series;
import day4.sum;

class series extends Thread{
	private int n;
	
	public series(int n) {
		this.n= n;
	}
	public void run() {
		
				int a[]= new int[100];
				a[0]=0;
				a[1]=1;
				for(int i=2; i<n;i++) {
					a[i]= a[i-2]+a[i-1];
					
				}
				for(int i=0;i<=n;i++) {
					System.out.print(a[i]+ " ");
				}
		}
	}

class reverse extends Thread{
	private int n;
	
	public reverse(int n) {
		this.n=n;
	}
	public void run() {

		int a[]= new int[100];
		a[0]=0;
		a[1]=1;
		for(int i=2; i<n;i++) {
			a[i]= a[i-2]+a[i-1];
		}
		for (int i = n - 1; i >= 0; i--)
        {
            System.out.print(a[i] +" ");
        }
		}
	}


class sum extends Thread{
	private int n;
	
	public sum(int n) {
		this.n=n;
	}
	public void run() {
		
		int a[]= new int[100];
		a[0]=0;
		a[1]=1;
		for(int i=2; i<n;i++) {
			a[i]= a[i-2]+a[i-1];
		}
		int sum=0;
		
		for(int i=0; i<=n;i++) {
			sum=sum+a[i];
		}
		System.out.println("\nSUM:"+sum);
	}
}


public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		series sc1=new series(n);
		sc1.start();
		System.out.println("\n==============================");
		reverse rev= new reverse(n);
		rev.start();
		System.out.println("\n==============================");
		sum sum=new sum(n);
		sum.start();
	
		
    }
}