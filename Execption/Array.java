package test;


import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int n,ind;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the index to find element from array:");
        ind=sc.nextInt();
        System.out.println("The element is : "+arr[ind-1]);
        sc.close();
    }
}
