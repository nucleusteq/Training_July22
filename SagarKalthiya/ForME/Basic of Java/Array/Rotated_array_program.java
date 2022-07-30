package Array;

import java.util.*;

public class Rotated_array_program {
   public static void main(String args[]) {
    int temp=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr=new int[n];
    System.out.print("enter number");
    for(int i = 0; i<n; i++){
        arr[i]=sc.nextInt();  
    }
    int rotation_time=2;
    //number of roatation
    do{
    temp=arr[arr.length-1];
    for (int i = arr.length-1; i>0; i--) {
        arr[i]=arr[i-1];
    }
    arr[0] = temp;
   
    rotation_time--;
   }while(rotation_time!=0);
   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+",");
   }
   }
}
