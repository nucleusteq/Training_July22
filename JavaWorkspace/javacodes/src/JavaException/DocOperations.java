package JavaException;
import java.util.Scanner;
/**
 * This class returns the element by choosing any index.
 * @author Himanshu
 * @version 2.0
 * <body>Checking body tag operations for this Application.</body>
 * @return Element from an array.
 * @param n number of elements going to be entered in array.
 * @param ind  position to get an element.
 * @param arr  initialization of array.
 */
public class DocOperations {
    public static void main(String[] args) {
    	/**
    	 
    	 */
        int n,ind;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        n=sc.nextInt();
        /**
         
         */
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
