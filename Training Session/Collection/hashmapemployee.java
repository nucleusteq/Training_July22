package collections;
import java.util.*;
import java.util.Map.Entry;

public class hashmapemployee {
public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	  HashMap<Integer,String> hs = new HashMap<>();
	  hs.put(1,"yuvraj");
	  hs.put(2,"ayush");
	  hs.put(3,"piyush");
	  hs.put(4,"yuvraj");
	  String str = "yuvraj"; 
	 
	  for (Entry<Integer, String> mapElement : hs.entrySet()) {
          if(mapElement.getValue()== str) {
		  System.out.println(mapElement.getKey());
          	}
         }
	  
}
	}

