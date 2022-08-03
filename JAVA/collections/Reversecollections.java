package collections;

import java.util.ArrayList;

public class Reversecollections {
	public static void main(String[] args) 
	
	{
	ArrayList<Integer> abc = new ArrayList<>();
	for(int i=1;i<81;i=i+4) {
		abc.add(i);
	}
	System.out.println("List is  : "+abc);
	
	ArrayList<Integer> reve = new ArrayList<>();
	
		for( int i =abc.size()-1;i>=0;i--) {
			reve.add(abc.get(i));
		}
		System.out.println("list Reverse is: "+reve);
	
		for( int i=0;i<reve.size()-1;i++) {
			if(reve.get(i)>50) {
				reve.set(i, reve.get(i)+5);
			}
		}
		System.out.print("Element smaller than 60 in the updated list : ");
		for(int i=0;i<reve.size()-1;i++) {
			if(reve.get(i)<60) {
				System.out.print(reve.get(i)+",");
			}
		}
	}
}