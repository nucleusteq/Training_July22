import java.util.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                int c = (a / b);
                System.out.print("The value of c ; " + c);
            } catch (ArithmeticException e) {
                System.out.println("b can't be zero");
            }
        }
    }
}