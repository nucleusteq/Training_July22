package Java_IO;
import java.io.*;
public class CopyContents {
	public static void main(String[]args) {
		File filer = new File("file1.txt");
		File filew = new File("file2.txt");
		try {
			FileWriter writes = new FileWriter("C:\\\\Users\\\\opera\\\\eclipse-workspace\\\\MultiThreading\\\\Java_Generics_Lambda_IO\\\\file1.txt");
			writes.write("Hellow");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		System.out.println("Reader file"+filer.getAbsolutePath());
//		System.out.println("Writer file"+filew.getAbsolutePath());
			try {
				FileReader reader = new FileReader("C:\\Users\\opera\\eclipse-workspace\\MultiThreading\\Java_Generics_Lambda_IO\\file1.txt");
				try {
					FileWriter writer = new FileWriter("C:/Users/opera/eclipse-workspace/MultiThreading/Java_Generics_Lambda_IO/file2.txt");
					int data;
					while((data = reader.read()) !=-1) {
						writer.write(data);
						System.out.println("File written successfully");
					}
					reader.close();
					writer.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			} 
			
			
			catch (FileNotFoundException e) {
				System.out.println(e);
			}
			
	}
}