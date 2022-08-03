package collections;

import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Linkedhashset {
public static void main(String[] args) {
	LinkedHashSet<Integer> ha = new LinkedHashSet<>();
     ha.add(5);
	ha.add(3);
	ha.add(1);
	ha.add(3);
	ha.add(2);
	
	
	System.out.println(ha);
	ha.clear();
	
	
	    for (int i=1;i<=10;i++) {
		           ha.add(i);
	}
	System.out.println(ha);
	System.out.println(ha.contains(10));
	System.out.println(ha.isEmpty());
	System.out.println(ha.size());
}
}