
import java.util.*;
import java.util.Map.Entry;

public class remove {
   public static void main(String[] args) {
         
      
      HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
     
      hash_map.put(10, "Harry");
      hash_map.put(15, "Ron");
      hash_map.put(20, "Hermoine");
      hash_map.put(25, "Hagrid");
      hash_map.put(30, "Ginny");
  
     
      System.out.println("Initial Mappings are: " + hash_map);
      Scanner sc= new Scanner(System.in);
    
     	 System.out.println("Enter the id you want to remove:");
     	 Integer id= sc.nextInt();
            
      String returned_value = (String)hash_map.remove(id);
  
            // Verifying the returned value
      System.out.println("Returned value is: "+ returned_value);
  
                // Displaying the new map
      System.out.println("New map is: "+ hash_map);
   }
}