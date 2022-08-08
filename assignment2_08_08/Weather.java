package assignment2_08_08;
import java.util.ArrayList;

public class Weather {
	
	public static void main(String[] args)
    {
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<String>();
        // Populating the ArrayList by custom elements
        al.add("Raipur");
        al.add("Bombay");
        al.add("Indore");
        al.add("Chennai");
        al.add("Bangalore");
        al.add("Bhopal");
        al.add("Jaipur");
        al.add("Jodhpur");
        String[] str = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }
        // Printing using for each loop
        for (String k : str) {
            System.out.println(k);
        }
    }
}   //code is not complete.