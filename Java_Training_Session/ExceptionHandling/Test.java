package ExceptionHandling;

import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}

		System.out.println("Enter index value : ");
		int index=sc.nextInt();
		System.out.println("Enter another index value : ");
		int index2=sc.nextInt();
		try{
			System.out.println("Element present at index "+index+" is :"+array[index-1]);
			int ans=array[index-1]/array[index2-1];
			System.out.println("The result after dividing elements at the two indexes is :"+ans);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of bounds");
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occured: "+e);
		}
		finally {
			sc.close();
		}
	}
}
