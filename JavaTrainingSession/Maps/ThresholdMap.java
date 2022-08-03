package JavaTrainingSession.Maps;

import java.util.Map.Entry;
import java.util.Scanner;
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
		
		temp.add(treeMap,11,"Manav");
		temp.add(treeMap,6,"Manav");
		temp.add(treeMap,5,"Hari");
		temp.add(treeMap,3,"Poco");
		temp.add(treeMap,2,"Piyush");
		temp.add(treeMap,8,"Yuvraj");
		temp.add(treeMap,9,"Ayush");
		temp.add(treeMap,10,"Manav");
		
		
		
		System.out.println(treeMap);
		
		
//		int thresh_val ;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the threshold size for map : ");
//		thresh_val=sc.nextInt();
//		
//		System.out.println("Keys are : ");
//		for (Entry<Integer,String> entry : treeMap.entrySet())
//		{
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}		
//		sc.close();
	}

}
