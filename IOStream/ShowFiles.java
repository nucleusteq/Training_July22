package JavaExplore;

import java.io.File;
import java.util.Date;
public class ShowFiles {

	

	
	     public static void main(String a[])
	     {
	        File file = new File("C:\\Users\\opera_ao6omsd\\eclipse-workspace\\IOStream");
	        String[] fileList = file.list();
	        for(String name:fileList){
	            System.out.println(name);
	        }
	    }
	}
	
	

