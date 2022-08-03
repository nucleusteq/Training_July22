import java.util.Scanner;

/**
 * Rotating an array class is used to rotate elements either towards right or
 * left based on user preference
 * 
 * @author Sejal Jain
 * @version 0.1
 * @since 0.1
 */
public class RotatingAnArray {

    /***
     * <p>
     * The main method is used to give user a choice to select the direction of
     * rotation. And to also specify the number of position it should rotate.
     * </p>
     * <a href="https://www.geeksforgeeks.org/arrays-in-java/">Arrays</a>
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 37, 8, 38, 99, 46, 96 };
        System.out.println("Select From Below Given Options: ");
        System.out.println("1. Rotate Right");
        System.out.println("2. Rotate Left");
        int option = sc.nextInt();

        switch (option) {

            case 1:
                System.out.println("Rotate By: ");
                int d = sc.nextInt();
                rightRotate(array, d);
                break;
            case 2:
                System.out.println("Rotate By: ");
                int d1 = sc.nextInt();
                leftRotate(array, d1);
                break;
            default:
                System.out.println("Please Enter a Valid Option");
        }
        sc.close();
    }

    /***
     * Left Rotate method is used to rotate array elements in left direction.
     * 
     * @param arr : It stores array elements
     * @param d   : It stores the number that how much an array should rotate
     */
    public static void leftRotate(int arr[], int d) {
        int n = d % arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (n >= arr.length) {
                n = 0;
            }
            System.out.print(arr[n++] + " ");
        }
    }

    /***
     * Right Rotate method is used to rotate array elements in right direction.
     * 
     * @param arr : It stores array elements
     * @param d   : It stores the number that how much an array should rotate
     */
    public static void rightRotate(int arr[], int d) {
        int n = d % arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i < d) {
                System.out.print(arr[arr.length + i - n] + " ");
            } else
                System.out.print(arr[i - n] + " ");
        }

    }
}