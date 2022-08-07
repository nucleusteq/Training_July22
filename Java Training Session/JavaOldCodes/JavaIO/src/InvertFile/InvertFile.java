package InvertFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class InvertFile
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("Enter name file: ");
		String fileName = new Scanner(System.in).nextLine();

		if ((new File(fileName)).isFile())
		{
			FileReader myfileRd = new FileReader(fileName);
			BufferedReader myfileRdBufferedReader = new BufferedReader(myfileRd);
			String line;
			int countLines = 0;

			// Count lines of file
			do
			{
				line = myfileRdBufferedReader.readLine();
				if (line != null)
				{
					countLines++;
				}
			} while (line != null);
			myfileRd.close();

			// Write of array of lines
			String[] lines = new String[countLines];
			int countLine = 0;
			myfileRd = new FileReader(fileName);
			line = "";
			do
			{
				line = myfileRdBufferedReader.readLine();
				if (line != null)
				{
					lines[countLine] = line;
					countLine++;
				}
			} while (line != null);
			myfileRd.close();

			// Write of file
			FileWriter myfileWr = new FileWriter(fileName + ".tnv");

			for (int i = lines.length - 1; i > 0; i--)
			{
				myfileWr.write(lines[i] + System.lineSeparator());
			}

			myfileWr.close();

		}
		else
		{
			System.out.println("The file no exists.");
		}
	}
}
