package test;


import java.util.Scanner;
public class ArrayException {
    public static void main(String[] args){
        int n,i,j;
        int div = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int k=0;k<n;k++)
            arr[k]=sc.nextInt();
        System.out.println("Enter the 1st Position :");
        i=sc.nextInt();
        System.out.println("Enter the 2nd Position :");
        j=sc.nextInt();

        try{
        div = arr[i-1]/arr[j-1];
        }
        catch(ArithmeticException e)
        {
            System.out.println("******Exception Ocuured******\nYour index element contains 0 , please choose another index!");
        }
        finally{
            System.out.println("Division is : "+div);
        }
        sc.close();
    }
}