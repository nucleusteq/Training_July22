public class JavaLangString{    
    public static void main(String args[]){    
    String s1="java";  
    char ch[]={'s','t','r','i','n','g','s'};    
    String s2=new String(ch);
    String s3=new String("example"); 
    String s4="nucleusteq";  
    String s5="nucleusteq";  
    String s6="NUCLEUSTEQ";  
    String s7="";  
    String s8="java string";   
    s8=s8.concat(" is immutable");     
    String s9 = "This is indexOf method";
    int index = s9.indexOf("method");
    

    System.out.println(s1);    
    System.out.println(s2);    
    System.out.println(s3);    
    System.out.println(s4.substring(2,4));
    System.out.println(s5.equals(s6));
    System.out.println(s7.isEmpty());  
    System.out.println(s8);    
    System.out.println("index of substring "+index);          
    }}    