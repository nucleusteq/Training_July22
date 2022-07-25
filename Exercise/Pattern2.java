import java.util.Scanner;
public class Pattern2 {
 public static void main(String[] args) {    
  Scanner cs=new Scanner(System.in);    
     System.out.println("Enter the row and column size:");
     char out,in;
     char row_size=cs.next().charAt(0);
     for(out='A';out<=row_size;out++)
     {
      for(in='A';in<=out;in++)
      System.out.print(in+" ");
      System.out.println();
     }
     cs.close();
 }
}