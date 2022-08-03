import java.util.HashMap;
public class ContainsKeyValue {
  public static void main(String[] args){
    HashMap<Integer, String> numbers = new HashMap<>();
  
    
    numbers.put(1, "One");
    numbers.put(2, "Two");
    numbers.put(3, "Three");
    
    System.out.println("The numbers in map are =>" + numbers );
    System.out.println("\nChecking  if  key 1 is present in map => " + numbers.containsKey(1));
    System.out.println("\nChecking  if  key 4 is present in map => " + numbers.containsKey(4));
    System.out.println("\nAdding a mapping for key '4'");
    numbers.put(4, "four");
    System.out.println("\nChecking  if the key 4 is present in map => " + numbers.containsKey(4));
System.out.println("\nChecking if the Three value is present in map => " +numbers.containsValue("Three"));
  }
}








