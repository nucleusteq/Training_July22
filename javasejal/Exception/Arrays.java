import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int index;

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter Array Index for searching");
        index = sc.nextInt();
        try {
            System.out.print("Required Array" + A[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("The given index  is out of bounds");
        }
    }
}