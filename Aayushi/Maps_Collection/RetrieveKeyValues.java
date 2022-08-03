import java.util.HashMap;
import java.util.Map.Entry;
public class RetrieveKeyValues {
public static void main(String args[]) {
HashMap<Integer,String> e= new HashMap<Integer, String>();

e.put(1, "One");
e.put(5, "Five");
e.put(7, "Seven");
e.put(3, "Three");


System.out.println(e);

for(Entry<Integer,String> entry : e.entrySet()) {
	System.out.println("Key:" +entry.getKey());
	System.out.println("Value:" +entry.getValue());
}
}
}