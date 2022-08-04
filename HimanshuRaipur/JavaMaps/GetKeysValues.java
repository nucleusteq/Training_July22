package maps;
import java.util.HashMap;
import java.util.Map.Entry;
public class GetKeysValues {
public static void main(String args[]) {
HashMap<Integer,String> e= new HashMap<Integer, String>();
e.put(9, "Nine");
e.put(0, "Zero");
e.put(4, "Four");
e.put(6, "Six");

System.out.println(e);

for(Entry<Integer,String> entry : e.entrySet()) {
	System.out.println("Key:" +entry.getKey());
	System.out.println("Value:" +entry.getValue());
}
}
}