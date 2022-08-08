package Arrrays;

import java.util.Scanner;

class ReverseCopyingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter Elements of array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int reverseArray[] = new int[array.length];
        for (int i = size - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }
        for (int n : reverseArray) {
            System.out.print(n + " ");
        }
    }

}
