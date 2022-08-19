package test;
import java.io.*;
public class Exception3 {
	public static void main(String[] args) 
	  {
	         
	    try {
	    	FileReader reader = new FileReader("file.txt");
	    
	    BufferedReader br = new BufferedReader(reader);
	      

	    }
	    catch(FileNotFoundException e) {
	    	System.out.println("File is missing");
	    }

	      
	  }
}
