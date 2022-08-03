package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class StringCollection {
public static void main(String args[]) {
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	set.add("Vanshika");
	set.add("Saigal");
	set.add("Hello");
	set.add("Vanshika");
	set.add("Hi");
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	 
	boolean b = Collections.addAll(set, "how", "are", "you");
System.out.println("List after adding few strings: "+set);
System.out.println("Size of LinkedHashSet=" + set.size());
set.remove("Hi");
System.out.println("After removing element: "+set);
}
}
