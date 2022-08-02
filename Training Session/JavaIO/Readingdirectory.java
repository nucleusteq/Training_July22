package inputoutput.java.com;

import java.io.File;
import java.util.Date;

public class Readingdirectory {
	

	     public static void main(String a[])
	     {
	        File file = new File("C:\\javap");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}

