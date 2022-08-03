package InvertFile;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class FileInvert {
    public static void main (String[] args) throws Exception {
        FileReader fr = new FileReader("demo1.txt");
        FileInputStream source = new FileInputStream("demo1.txt");
        
        int countLines=0;
        while(source.read()!= -1) {
            countLines++;
        }
        String[] lines = new String[countLines];
        countLines=0;
        BufferedReader br = new BufferedReader(fr);
        String line=null;
        do {
            line = br.readLine();
            {
                lines[countLines]= line;
                countLines++;
            }
        }while(line !=null);
        br.close();
        source.close();
        FileWriter fw = new FileWriter("demo1"+".tnv");
        for (int i = lines.length-1; i>0; i--) {
            fw.write(lines[i]+ System.lineSeparator());
        }
        fw.close();
    }
}
