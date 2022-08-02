package inputoutput.java.com;

import java.io.*;

public class Copyingfile {
	public static void main(String[] args) {
		try {
			FileInputStream source = new FileInputStream("Text1.txt");
			FileOutputStream target = new FileOutputStream("Text2.txt");
			int value;
			while((value = source.read()) !=-1) {
				target.write(value);
			}
			source.close();
			target.close();
			System.out.println("File copied successfully!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
