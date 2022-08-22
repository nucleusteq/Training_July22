package Maps;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


class addMethod{
	static void add(TreeMap<Integer,String> map_obj,int key ,String value) {
		map_obj.put(key,value);
	}
}
public class ContainsKeyOrValue {
	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();

		temp.add(treeMap,5,"Hari");
		temp.add(treeMap,3,"Poco");
		temp.add(treeMap,2,"Piyush");
		temp.add(treeMap,8,"Yuvraj");
		temp.add(treeMap,9,"Ayush");
		temp.add(treeMap,10,"Manav");

		System.out.println(treeMap);

		String inputValue = null ;
		int inputKey = 00;
		String in;
		int count=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Search Key or Value choose - K/V : ");
		in=sc.next();

		if (in.equals("K")) {
			System.out.println("Enter key : ");
			inputKey=sc.nextInt();
		}
		else if(in.equals("V")) {
			System.out.println("Enter Value : ");
			inputValue=sc.next();
		}


		for (Entry<Integer,String> entry : treeMap.entrySet())
		{
			if(inputKey == entry.getKey()) {
				System.out.println("Yes key is available!");
				count=1;
			}
			else if(inputValue!=null)
				{
					if (inputValue.equals(entry.getValue())) {
						System.out.println("Yes Value is Present");
						count=1;
					}
				}
		}
		if (count==0)
		System.out.println("No key or Value is present!");
	}
}	

