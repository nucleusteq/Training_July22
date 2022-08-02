package Demo;
import java.io.*;
public class Copyfile {
	public static void main(String[] args) throws IOException{
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try {
			sourceStream = new FileInputStream("c:\\Users\\opera\\eclipse-workspace\\File Handling\\src\\Demo\\Source_file.txt");
			targetStream = new FileOutputStream("C:\\Users\\opera\\eclipse-workspace\\File Handling\\src\\Demo\\Destination_file.txt");
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
