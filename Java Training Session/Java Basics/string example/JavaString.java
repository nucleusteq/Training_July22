package string example;

import java.util.*;
//This program is for Returning char index
public class Java_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10 to run a Program");
        System.out.println("1 :-Program of CharAT()");
        System.out.println("2 :- Program of Lenght_method()");
        System.out.println("3 :- Program of Concat() to string");
        System.out.println("4 :- Program of char_array_method()");
        System.out.println("5 :- Program of to string trim ()");
        System.out.println("6 :- Program of Uppercase_method()");
        System.out.println("7 :- Program of Lowercase_method()");
        System.out.println("8 :- Program of Endswith_method()");
        System.out.println("9 :- Program of Indexof_method()");
        System.out.println("10 :- Program of Valueof_method()");
        int code = sc.nextInt();
        switch(code){
            case 1:
            System.out.println("Program of CharAT()");
            CharAT_method();
            break;
            case 2:
            System.out.println("Program of Lenght_method()");
            Lenght_method();
            break;
            case 3:
            System.out.println("Program of Concat() to string");
            Concat_method();
            break;
            case 4:
            System.out.println("Program of to char_array_method() ");
            char_array_method();
            break;
            case 5:
            System.out.println("Program of to string trim ()");
            Trim_method();
            break;
            case 6:
            System.out.println("Program of to Uppercase_method()");
            Uppercase_method();
            break;
            case 7:
            System.out.println("Program of to Lowercase_method()");
            Lowercase_method();
            break;
            case 8:
            System.out.println("Program of to Endswith_method()");
            Endswith_method();
            break;
            case 9:
            System.out.println("Program of to Indexof_method()");
            Indexof_method();
            break;
            case 10:
            System.out.println("Program of to Valueof_method()");
            Valueof_method();
            break;
        }
    }
    public static void CharAT_method() {
        String name="NucleusTeq";
        char ch=name.charAt(4);
        //returns the char value at the 4th index
        System.out.println(ch);
    }
    public static void Lenght_method() {
        String s1="sagar";
        String s2="kalthiya";
        System.out.println("string length is: "+s1.length());
        //10 is the length of sagar string
        System.out.println("string length is: "+s2.length());
        //6 is the length of kalthiya string
    }
    public static void Concat_method() {
        String s1="My name ";
        // The string s1 does not get changed
        s1=s1.concat("is sagar");
        System.out.println(s1);
        //This is just simplly adding Two strings
    }
    public static void char_array_method() {
        String s1="hello";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
        System.out.print(ch[i]);
      }
    }
    public static void Trim_method() {
        String s1="  hello sagar   ";
        //Basically Trim is just for removing spaces
        System.out.println(s1+"Nucleusteq");//without trim()
        System.out.println(s1.trim()+"Nucleusteq");//with trim()
    }
    public static void Uppercase_method() {
        //it is converting string to uppercase
        String s1="hello sagar";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
    }
    public static void Lowercase_method() {
        //it is converting string in  lower case
        String s1="HELLO SAGAR";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);
    }
    public static void Endswith_method() {
        //it will check where the strings end if it is true then it show true otherwise false
        String s1="hello sagar";
        System.out.println(s1.endsWith("d"));//it is false
        System.out.println(s1.endsWith("sagar"));//it is true
    }
    public static void Indexof_method() {
        //it will return index of  value
        String s1 = "This is index Of method where we can see index value";
        // Passing Substring
        int index = s1.indexOf("method"); //Returns the index of this word
        System.out.println("index of that word "+index);
    }
    public static void Valueof_method() {
        //it is just converting datatype into a string
        int value=50;
        String s1=String.valueOf(value);
        System.out.println(s1+10);//here we can see it is concatenating string with 10
    }
}