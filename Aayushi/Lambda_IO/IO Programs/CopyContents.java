

import java.io.*;
public class CopyContents {
	public static void main(String[] args) throws IOException{
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try {
			sourceStream = new FileInputStream("C:\\Users\\aayus\\eclipse-workspace\\Shapes\\src\\aayushi1.txt.txt");
			targetStream = new FileOutputStream("C:\\Users\\aayus\\eclipse-workspace\\Shapes\\src\\aayushi2.txt.txt");
			int temp;
			while((temp = sourceStream.read())!= -1)
				targetStream.write((byte)temp);
		}
		finally {
			if(sourceStream != null)
				{System.out.println("File writing successful");
				 sourceStream.close();
				}
			if(targetStream !=null)
				targetStream.close();
				
		}
	}
}