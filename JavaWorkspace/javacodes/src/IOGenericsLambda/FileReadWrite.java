package IOGenericsLambda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
public static void main(String[] args) {
	
	int line;
	try{
		FileReader fr = new FileReader("C:\\Users\\opera\\OneDrive\\Desktop\\Daily excercises\\practice\\source.txt");
		BufferedReader br = new BufferedReader(fr);
				
		FileWriter fw = new FileWriter("C:\\Users\\opera\\OneDrive\\Desktop\\Daily excercises\\practice\\destination.txt");
        BufferedWriter bw = new BufferedWriter(fw);
		
        while ((line = br.read()) != -1) {
        	System.out.print((char)line);
        	bw.write((char)line);
        }
        br.close();
        bw.close();    	
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
