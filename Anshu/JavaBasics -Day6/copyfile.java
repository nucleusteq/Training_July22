package FileIO;


import java.io.*;

public class copyfile {
	public static void main(String[] args) throws IOException{
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;
		
		try {
			sourceStream = new FileInputStream("C:\\Users\\opera\\eclipse-workspace\\javabasics4\\src\\FileIO\\sourcefile.txt");
			targetStream = new FileOutputStream("C:\\Users\\opera\\eclipse-workspace\\javabasics4\\src\\FileIO\\targetfile.txt");
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
