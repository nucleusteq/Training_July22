package JavaTrainingSession.IOGenericsLambda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReverseFileReadWrite {

	public static void main(String[] args) {
		
		String line;
		String line2;
		int count=0;
		int i=0;
		try{
			FileReader fr = new FileReader("C:\\Users\\opera\\OneDrive\\Desktop\\Daily excercises\\practice\\reverse1.txt");
			BufferedReader br = new BufferedReader(fr);	
					        
			while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	        	count++;
	        }
			
			FileReader fr2 = new FileReader("C:\\Users\\opera\\OneDrive\\Desktop\\Daily excercises\\practice\\reverse1.txt");
			BufferedReader br2 = new BufferedReader(fr2);	
			
			String[] arr = new String[count];
	        while ((line2 = br2.readLine()) != null) {
	        	arr[i]= line2;
	        	i++;
	        }
	        
	        FileWriter fw = new FileWriter("C:\\Users\\opera\\OneDrive\\Desktop\\Daily excercises\\practice\\reverse2.tnv");
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        for(int x=count-1 ;x>=0;x--)
	        {
	        	bw.write(arr[x]+ System.lineSeparator());
	        }
	        
	        fr.close();
	        bw.close();    	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	}
