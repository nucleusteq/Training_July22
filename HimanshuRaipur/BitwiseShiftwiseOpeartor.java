import java.util.Scanner;
import java.lang.*;

public class BitwiseShiftwiseOperator {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Enter First Number:");
    int number1 = myObj.nextInt();
    
    System.out.println("Enter Second Number:");
    int number2 = myObj.nextInt();

    // bitwise OR between number1 and number2
    int BitwiseOr = number1 | number2;
    System.out.println("Bitwise OR between Number1 and Number2 is:" +BitwiseOr); 
    
    // bitwise And between number1 and number2
    int BitwiseAnd = number1 & number2;
    System.out.println("Bitwise AND between Number1 and Number2 is:" +BitwiseAnd);
    
    // bitwise XOR between number1 and number2
    int BitwiseXOr = number1 ^ number2;
    System.out.println("Bitwise XOR between Number1 and Number2 is:" +BitwiseXOr);
    
    // bitwise Complement of number1
    int ComplementNum1 = ~number1;
    System.out.println("Bitwise Complement of Number1 is:" +ComplementNum1);
    
    // bitwise Complement of number2
    int ComplementNum2= ~number2;
    System.out.println("Bitwise Complement of Number2 is:" +ComplementNum2);
    
    // 2 bit left shift operation for number1
    int LeftShiftNum1 = number1 << 2;
    System.out.println("Bitwise Left Shift of Number1 is:" +LeftShiftNum1);

    
    // 2 bit right shift operation for number1
    int RightShiftNum1 = number1 >> 2;
    System.out.println("Bitwise Right Shift of Number1 is:" +RightShiftNum1);
    
    // 2 bit left shift operation for number2
    int LeftShiftNum2 = number2 << 2;
    System.out.println("Bitwise Left Shift of Number2 is:" +LeftShiftNum2);
    
    // 2 bit right shift operation for number2
    int RightShiftNum2 = number2 >> 2;
    System.out.println("Bitwise Right Shift of Number2 is:" +RightShiftNum2);
   
  }
}