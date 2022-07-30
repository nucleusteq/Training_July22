package Introduction.Arrays;
import java.util.*;

public class ReversCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array :- ");
		int size=sc.nextInt();
		System.out.println("Enter Elements of Array :-");
		int array[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=sc.nextInt();
		}
		
		int reverseArray[]=new int[array.length];
		for(int i=size-1,j=0;i>=0;i--,j++){
			reverseArray[j]=array[i];
		}
		for (int k = 0; k < reverseArray.length; k++) {
            System.out.println("Reverse Array is  :- "+reverseArray[k]);
        }
	}

}
