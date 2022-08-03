package Collection;
import java.util.*;
///import java.util.ArrayList;

public class IntegerCollection {
public static void main(String args[]) {
	ArrayList<Integer> list= new ArrayList<Integer>();

	list.add(12);
	list.add(21);
	list.add(33);
	list.add(455);
	list.add(56);
	list.add(16);
	list.add(76);
	list.add(28);
	list.add(9);
	list.add(10);
	list.add(15);
	list.add(12);
	list.add(31);
	list.add(14);
	list.add(44);
	list.add(13);
	list.add(78);
	list.add(18);
	list.add(19);
	list.add(24);
	
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



	

