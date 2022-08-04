<<<<<<< HEAD
package Maps;

import java.util.TreeMap;

class addElements{
	static void add(TreeMap<Integer,String> map_obj,int key ,String value)
	{
		map_obj.put(key,value);
	}
}
public class ThresholdMap {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		addElements.add(treeMap,11,"Yuvraj");
		addElements.add(treeMap,6,"Piyush");
		addElements.add(treeMap,5,"Ayush");
		addElements.add(treeMap,3,"Poco");

		System.out.println("Current tree map having 4 elements : "+treeMap);
		System.out.println("Now assigning map size = 3 \n");
		int thresholdSize = 3;
		
		if (treeMap.size() >= thresholdSize){
			treeMap.clear();
		}
		System.out.println("Now doing one entry in map via add method.");
		addElements.add(treeMap,8,"manav");
		System.out.println("After clearing the map and adding one entry : "+treeMap);
		
	}

=======
package Maps;

import java.util.TreeMap;

class addElements{
	static void add(TreeMap<Integer,String> map_obj,int key ,String value)
	{
		map_obj.put(key,value);
	}
}
public class ThresholdMap {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		addElements.add(treeMap,11,"Yuvraj");
		addElements.add(treeMap,6,"Piyush");
		addElements.add(treeMap,5,"Ayush");
		addElements.add(treeMap,3,"Poco");

		System.out.println("Current tree map having 4 elements : "+treeMap);
		System.out.println("Now assigning map size = 3 \n");
		int thresholdSize = 3;
		
		if (treeMap.size() >= thresholdSize){
			treeMap.clear();
		}
		System.out.println("Now doing one entry in map via add method.");
		addElements.add(treeMap,8,"manav");
		System.out.println("After clearing the map and adding one entry : "+treeMap);
		
	}

>>>>>>> 7d9c3849eabb7c940c682fcf6f99285f8b0e60a1
}