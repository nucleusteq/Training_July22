package InvertFile;

import java.io.*;
public class Copyingfiles {
	public static void main(String[] args) {
		try {
			FileInputStream source = new FileInputStream("demo1.txt");
			FileOutputStream target = new FileOutputStream("Test1.txt");
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