package inputoutput.java.com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Reversecopying {
	public static void main (String[] args) throws Exception {
		FileReader fr = new FileReader("Text1.txt");
		FileInputStream source = new FileInputStream("Text1.txt");
		
		int countLines=0;
		while(source.read()!= -1) {
			countLines++;
		}
		String[] lines = new String[countLines];
		countLines=0;
		BufferedReader br = new BufferedReader(fr);
		String line="";
		do {
			line = br.readLine();
			{
				lines[countLines]= line;
				countLines++;
			}
		}while(line !=null);
		br.close();
		source.close();
		FileWriter fw = new FileWriter("Text3"+".tnv");
		for (int i = lines.length-1; i>0; i--) {
			fw.write(lines[i]+ System.lineSeparator());
		}
		fw.close();
	}
}
