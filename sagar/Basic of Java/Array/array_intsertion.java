package Array;
import java.util.*;

public class array_intsertion {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of Array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter the Value of Array:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\n");
        }    
    }
}
