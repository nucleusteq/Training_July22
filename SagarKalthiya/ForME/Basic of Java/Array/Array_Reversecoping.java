package Array;
import java.util.*;

public class Array_Reversecoping {
    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of Array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("\nEnter the Value of Array:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] rev =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] =arr[arr.length-i-1];
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]+" ");
        }
    }
}
