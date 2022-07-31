package JavaTrainingSession.JavaBasics.String;

public class ConcatExample
{  
    public static void main(String[] args) {      
        String str1 = "Hello";  
        String str2 = "wolrd";  
        String str3 = "brother";  
        // Concatenating one string   
        String str4 = str1.concat(str2);          
        System.out.println(str4);  
        // Concatenating multiple strings  
        String str5 = str1.concat(str2).concat(str3);  
        System.out.println(str5);  
    }  
}  