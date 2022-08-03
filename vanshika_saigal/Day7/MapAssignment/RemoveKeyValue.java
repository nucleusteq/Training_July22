package maps;
import java.util.*;
import java.util.Scanner;
public class RemoveKeyValue {
public static void main(String[] args) {
    
    HashMap<Integer, String> remove = new HashMap<Integer, String>();
 
    remove.put(10, "Vanshika");
    remove.put(15, "Aayushi");
    remove.put(20, "Reena");
    remove.put(25, "Aashi");
    remove.put(30, "Himanshu");
 
    System.out.println("Initial Mappings are: " + remove);
 Scanner sc=new Scanner(System.in);
 System.out.println("Give the ID which you want to remove:");
 Integer id=sc.nextInt();
    String returned_value = (String)remove.remove(id);
 
    System.out.println("Returned value is: "+ returned_value);
 
    System.out.println("New map is: "+ remove);
}
}
