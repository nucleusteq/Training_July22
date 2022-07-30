
import java.util.*;
import java.util.Scanner;
/*
 Main method is referred as entry point of Java application which is true in case of core java application.
 Remove public from main method - Error: Main method not found in class FJProgram, please define the main method as:
   public static void main(String[] args)
   Remove static - Error: Main method is not static in class FJProgram
    public static void main(String[] args) - This happened because Java main() method is always static, 
    so that compiler can call it without the creation of an object or before the creation of an object of the class.
 */
public class FJProgram{
    public static void main(String args[]){
        System.out.println("Hello World!"); 
    }
}
