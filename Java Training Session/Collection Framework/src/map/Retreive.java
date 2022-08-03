package map;

import java.util.HashMap;
import java.util.Iterator;

public class Retreive {
	 // Program to print all keys present in the map using `keySet()` in Java
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
 
     
        Iterator<Integer> itr = map.keySet().iterator();  //// iterate the key
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        String return_value=(String) map.remove(2);   ///remove the key
        System.out.println(map);
 

}}
