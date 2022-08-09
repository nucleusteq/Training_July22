package maps;
import java.util.*;
import java.util.Scanner;
public class RemoveKeyValue {
public static void main(String[] args) {
    
    HashMap<Integer, String> remove = new HashMap<Integer, String>();
 
    remove.put(1, "Delhi");
    remove.put(2, "Mumbai");
    remove.put(3, "Bangalore");
    remove.put(4, "Kolkata");
    remove.put(5, "Chennai");
 
    System.out.println("Initial Mappings are: " + remove);
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter ID that you want to remove:");
 Integer id=sc.nextInt();
    String returned_value = (String)remove.remove(id);
 
    System.out.println("Returned value is: "+ returned_value);
 
    System.out.println("New map is: "+ remove);
}
}