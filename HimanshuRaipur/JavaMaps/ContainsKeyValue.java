package maps;
import java.util.HashMap;

public class ContainsKeyValue {
  public static void main(String[] args){

    HashMap<Integer, String> numbers = new HashMap<>();

    numbers.put(1, "Delhi");
    numbers.put(2, "Mumbai");
    numbers.put(3, "Kolkata");
    System.out.println("The numbers map is =>" + numbers );

    System.out.println("\nChecking  if the key 3 is present in map =>" + numbers.containsKey(3));
    System.out.println("\nChecking  if the key 4 is present in map =>" + numbers.containsKey(4)); 
    
    System.out.println("\nAdding a mapping for key \'4\'");

    numbers.put(4, "Chennai");
    System.out.println("\nChecking  if the key 4 is present in map =>" + numbers.containsKey(4)); 
System.out.println("\nChecking if the Three value is present in map =>" +numbers.containsValue("Mumbai"));
  }
}

