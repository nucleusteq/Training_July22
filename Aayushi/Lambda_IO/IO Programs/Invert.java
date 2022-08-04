import java.io.*;
import java.util.*;
 
public class  Invert{
    public static void main (String [] args) throws IOException{
    	
        FileReader fr = new FileReader("C:\\Users\\aayus\\eclipse-workspace\\Shapes\\src\\AAYUSHI.txt");
        java.io.FileWriter fw = new java.io.FileWriter("C:\\Users\\aayus\\eclipse-workspace\\Shapes\\src\\invert" + ".tnv");
         
        BufferedReader myfile = new BufferedReader(fr);
        String data = myfile.readLine();      
        while(data != null){
            String get = getdata(data);
            System.out.println(get);
            fw.write(get+"\r\n");
            data = myfile.readLine();
        }
 
        fr.close();
        fw.close();
    }
     
    public static String getdata(String d){
        StringTokenizer st = new StringTokenizer(d, "\"-.,;", true);
        String g = "";
        while(st.hasMoreTokens()){
                 String s = st.nextToken();
                 int count = s.length();
                    if(count == 1){
                g += s;
                                  }
                   else{
                StringTokenizer st2 = new StringTokenizer(s, " ", true);
              while(st2.hasMoreTokens()){
                    String s2 = st2.nextToken();
                    int count2 = s2.length();
                        for(int i = 1; i <= count2; i++){
                        char c = s2.charAt(count2-i);
                        g += c;
                                             }
         }
       }
      }
        return g;
}
}