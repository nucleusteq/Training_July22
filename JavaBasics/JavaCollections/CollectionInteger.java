package Collection;
import java.util.*;
///import java.util.ArrayList;

public class CollectionInteger {
public static void main(String args[]) {
	ArrayList<Integer> list= new ArrayList<Integer>();

	list.add(9);
	list.add(50);
	list.add(350);
	list.add(564);
	list.add(70);
	list.add(14);
	list.add(98);
	list.add(56);
	list.add(80);
	list.add(34);
	list.add(25);
	list.add(38);
	list.add(801);
	list.add(89);
	list.add(65);
	list.add(34);
	list.add(85);
	list.add(31);
	
	Iterator itr= list.iterator();
	System.out.println("Integer collection: ");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("\n==================================================");
	   Comparator<Integer> cmp = Collections.reverseOrder(null);    
       Collections.sort(list, cmp);  
       System.out.println("List sorted in ReverseOrder: ");        
       for(int i : list) {  
          System.out.println(i+ " ");  
       }   
   	System.out.println("\n==================================================");

       int till=60;
       for(int m:list) {
       	if(m<till) {
       		System.out.println("Values greater than 60: "+m);
       	}
       }
       
       int particular_value = 50;

       for (int i : list) {
           if (i > particular_value) {
               //System.out.println("Value " + i + " is greater than " + particular_value);
          int index= list.indexOf(i);
          list.set(index, 5);
         
       }
      
       
}
   	System.out.println("\n==================================================");
System.out.println("After updating values with 5: "+list);


}}



	
