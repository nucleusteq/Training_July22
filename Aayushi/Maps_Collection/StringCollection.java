import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StringCollection {
public static void main(String args[]) {
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	set.add("Harry");
	set.add("Hermoine");
	set.add("Ron");
	set.add("are");
	set.add("are");
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	 
	boolean b = Collections.addAll(set, "are", "friends", "forever");
System.out.println("List after adding few strings: "+set);
System.out.println("Size of LinkedHashSet=" + set.size());
set.remove("are");
System.out.println("After removing element: "+set);
}
}