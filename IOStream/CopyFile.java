package JavaExplore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String args[])throws IOException {
		
		File f1 = new File("C:\\Users\\opera_ao6omsd\\eclipse-workspace\\IOStream\\file1.txt");
		 FileInputStream fin = null;
		 FileOutputStream fout = null;
		 
		 try {
			 fin = new FileInputStream(f1);
			 fout = new FileOutputStream("C:\\Users\\opera_ao6omsd\\eclipse-workspace\\IOStream\\file2.txt");
			 
			 int content;
			 while((content = fin.read())!=  -1)
			 {
				 fout.write(content);
				 
			 }
			 
			 System.out.println("copy succesfully");
		 }catch(Exception e) {
			 
			 System.out.println(e);
		 }
		 
	}
	
}


