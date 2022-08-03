package shapes;
import java.io.*; 
import java.util.*;   
public class Copy_Content {  
 public static void copyData(File file1, File file2) throws Exception  
 { 
     FileInputStream inputStream = new FileInputStream(file1);  
     FileOutputStream outputStream = new FileOutputStream(file2);  
     try {          
         int i;  
         while ((i = inputStream.read()) != -1) {  
              
             outputStream.write(i);  
         }  
     }  
     catch(Exception e) {  
         System.out.println("Error Found: "+e.getMessage());  
     }  
     finally {  
         if (inputStream != null) {  
             inputStream.close();  
         }  
         if (outputStream != null) {  
             outputStream.close();  
         }  
     }  
     System.out.println("File Copied");  
 }  
 public static void main(String[] args) throws Exception  
 { 
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter the name of the file from where the data would be copied :");  
     String file1 = sc.nextLine();  
     File a = new File("C:\\Users\\vansh\\eclipse-workspace\\shapes\\src\\shapes\\"+file1);  
     System.out.println("Enter the name of the file from where the data would be written :");  
     String file2 = sc.nextLine();
     File b = new File("C:\\Users\\vansh\\eclipse-workspace\\shapes\\src\\shapes\\"+file2);  
     sc.close(); 
     copyData(a, b);  
 }  
}   
