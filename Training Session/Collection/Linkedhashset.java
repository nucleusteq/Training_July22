package collections;

import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Linkedhashset {
public static void main(String[] args) {
	LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
	lhs.add(2);
	lhs.add(3);
	lhs.add(1);
	lhs.add(3);
	lhs.add(5);
	System.out.println(lhs);
	lhs.clear();
	for (int i=1;i<=20;i++) {
		lhs.add(i);
	}
	System.out.println(lhs);
	System.out.println(lhs.contains(20));
	System.out.println(lhs.isEmpty());
	System.out.println(lhs.size());
}
}
