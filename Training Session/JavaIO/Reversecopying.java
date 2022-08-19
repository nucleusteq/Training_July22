package inputoutput.java.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Reversecopying {
	public static void main (String[] args) throws Exception {
		FileReader fr = new FileReader("Text1.txt");
		FileReader myfile = new FileReader("Text1.txt");
		BufferedReader fileread = new BufferedReader(myfile);
		int countLines=0;
		String readline="";
		do
		{
			readline = fileread.readLine();
			if (readline != null)
			{
				countLines++;
			}
		} while (readline != null);
		fileread.close();
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
		}while(line != null);
		br.close();
		FileWriter fw = new FileWriter("Text1"+".tnv");
		for (int i = lines.length-1; i>=0; i--) {
			fw.write(lines[i]+ System.lineSeparator());
		}
		fw.close();
	}
}
