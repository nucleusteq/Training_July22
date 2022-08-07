package InvertFile;

import java.io.File;
import java.util.Date;

public class Directory {
     public static void main(String a[])
     {
    	 try {
    		  
           
             File f = new File("C:\\PIYUSH RAGHUWANSHI\\Java Training Session");
   
             
             String[] files = f.list();
   
             System.out.println("Files are:");
   
       
             for (int i = 0; i < files.length; i++) {
                 System.out.println(files[i]);
             }
         }
         catch (Exception e) {
             System.err.println(e.getMessage());
         }
    }
}