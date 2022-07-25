package Loops;
import java.util.*;

public class Java_Armstrong {
    public static void main(String[] args) {
        int num = 371, originalNum, remainder, result = 0;
        originalNum = num;
        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }   
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
