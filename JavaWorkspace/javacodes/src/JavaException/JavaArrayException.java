package JavaException;
import java.util.Scanner;
public class JavaArrayException {
    public static void main(String[] args){
        int n,ind1,ind2;
        int div = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store:");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the 1st Position :");
        ind1=sc.nextInt();
        System.out.println("Enter the 2nd Position :");
        ind2=sc.nextInt();

        try{
        div = arr[ind1-1]/arr[ind2-1];
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
