package collections;

import java.util.ArrayList;

public class Reversecollection {
	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=1;i<81;i=i+4) {
		al.add(i);
	}
	System.out.println("List : "+al);
	ArrayList<Integer> reverseal = new ArrayList<>();
		for( int i =al.size()-1;i>=0;i--) {
			reverseal.add(al.get(i));
		}
		System.out.println("Reverse list : "+reverseal);
	
		for( int i=0;i<reverseal.size()-1;i++) {
			if(reverseal.get(i)>50) {
				reverseal.set(i, reverseal.get(i)+5);
			}
		}
		System.out.print("Element smaller than 60 in the updated list : ");
		for(int i=0;i<reverseal.size()-1;i++) {
			if(reverseal.get(i)<60) {
				System.out.print(reverseal.get(i)+",");
			}
		}
	}
}
