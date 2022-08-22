package Maps;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


class temp{
	static void add(TreeMap<Integer,String> map_obj,int key ,String value) {
		map_obj.put(key,value);
	}
}
public class RetriveKey {
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
		
		String name ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to ge the keys: ");
		name=sc.next();
		
		System.out.println("Keys are : ");
		for (Entry<Integer,String> entry : treeMap.entrySet())
		{
			if (name.equals(entry.getValue()))
			{
				System.out.println(entry.getKey());
			}
		}		
		sc.close();
	}

}
