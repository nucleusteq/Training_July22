import java.util.*;

public class InsertingElement
{

    public static void main(String[] args)

    {
        int pos=3;
        int element=100;
        int[] arr = new int[]{10,20,30,40,50};
        {
            for (int i = arr.length-1;i>pos-1; i--)
            {
                arr[i]=arr[i-1];
            }
            arr[pos-1]=element;

        }
        for (int i = 0; i < arr.length; i++)

        {
            System.out.print(arr[i]+",");

        
        }  
       
            
    }
}
