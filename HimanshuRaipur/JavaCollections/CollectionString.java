package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionString {
public static void main(String args[]) {
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	set.add("Hello");
	set.add("Himanshu");
	set.add("Dhoke");
	set.add("Welcome");
	set.add("NucleusTeq");
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	 
	boolean b = Collections.addAll(set, "how", "are", "you");
System.out.println("List after adding few strings: "+set);
System.out.println("Size of LinkedHashSet=" + set.size());
set.remove("Dhoke");
System.out.println("After removing element: "+set);
}
}