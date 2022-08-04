import java.lang.String;
public class StringConcat
{  
    public static void main(String[] args) {      
        String str1 = "Koffee";  
        String str2 = "With";  
        String str3 = "Aayushi";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
    }  
}  