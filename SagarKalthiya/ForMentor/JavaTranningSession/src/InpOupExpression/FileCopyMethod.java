package InpOupExpression;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream instream = null;
		FileOutputStream outstream = null;
	 
	    	try{
	    		//path in which file content to copy 
	    	    File infile =new File("C:\\Users\\opera\\OneDrive\\Desktop\\git2\\Training_July22\\SagarKalthiya\\ForMentor\\JavaTranningSession\\src\\InpOupExpression\\dataOne.txt");
	    	    // in which file to copy thta data
	    	    File outfile =new File("C:\\\\Users\\\\opera\\\\OneDrive\\\\Desktop\\\\git2\\\\Training_July22\\\\SagarKalthiya\\\\ForMentor\\\\JavaTranningSession\\\\src\\\\InpOupExpression\\\\dataTwo.txt");
	 
	    	    instream = new FileInputStream(infile);
	    	    outstream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer, 0, length);
	    	    }

	    	    //Closing the i/o file streams 
	    	    instream.close();
	    	    outstream.close();

	    	    System.out.println("File copied successfully!!");
	 
	    	}catch(IOException ioe){
	    		ioe.printStackTrace();
	    	 }

	}

}
/*output of this program looks this
 * but
 * File copied successfully!!
*file one content copy to file to you can check with file and if u 
*want to change any thing re run the program file 2 data will also chnage 
*
*/
