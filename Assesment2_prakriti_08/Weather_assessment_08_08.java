package Assesment_2;

import java.util.ArrayList;

public class Weather_assessment_08_08 {

	
	public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<String>();
 
        // Populating the ArrayList by custom elements
        al.add("indore");
        al.add("dewas");
        al.add("lunknow");
        al.add("delhi");
        al.add("mumbai");
        al.add("chennai");
        al.add("banglore");
        al.add("madras");
       

        String[] str = new String[al.size()];
 
        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }
 
        // Printing using for each loop
        for (String k : str) {
            System.out.println(k);
        }
    }
}
