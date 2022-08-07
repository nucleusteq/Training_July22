import java.io.*;
public class CopyContents {
	public static void main(String[] args) throws IOException{
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try {
			sourceStream = new FileInputStream("C:\\GIT 2\\Training_July22\\kiran\\kiran_javabasics6\\Lamda Expression\\invert\\kiran.txt");
			targetStream = new FileOutputStream("C:\\GIT 2\\Training_July22\\kiran\\kiran_javabasics6\\Lamda Expression\\invert\\kiran.2");
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
