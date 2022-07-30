package Introduction.Arrays;
import java.util.*;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array :- ");
		int size=sc.nextInt();
		System.out.println("Enter Elements of Array :- ");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Position of new element to be inserted :- ");
		int position=sc.nextInt()-1;
		System.out.println("Enter the element to be inserted :- ");
		int num=sc.nextInt();
		int arr2[]=new int[size+1];
		for(int i=0;i<position;i++){
			arr2[i]=arr[i];
		}
		arr2[position+1]=arr[position];
		arr2[position]=num;
		for(int i=position+1;i<size;i++){
			arr2[i+1]=arr[i];
		}
		
		System.out.println("After inserting :- ");
		for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr2[i]+",");
        }
		

	}

}
