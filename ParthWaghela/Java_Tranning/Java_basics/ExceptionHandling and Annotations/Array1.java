import java.util.*;
public class Array1{
	public static void main(String[] args) { 
	 int x[] = new int[5];
	 int index;
	 Scanner s=new Scanner(System.in);
	 for(int i =0; i<5;i++) {
		 x[i]= s.nextInt();
	 }
	 System.out.print("Enter Array Index");
	 index = s.nextInt();
	 try{
		 System.out.print("Required Array" + x[index]);
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.print("Array is out of bounds");
	 }
	}
}
