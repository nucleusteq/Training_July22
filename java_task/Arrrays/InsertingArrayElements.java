package Arrrays;

import java.util.Scanner;

class InsertingArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter Elements of array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Position of new element to be inserted: ");
        int posi = sc.nextInt() - 1;
        System.out.print("Enter the element to be inserted: ");
        int num = sc.nextInt();
        int array2[] = new int[size + 1];
        for (int i = 0; i < posi; i++) {
            array2[i] = array[i];
        }
        array2[posi + 1] = array[posi];
        array2[posi] = num;
        for (int i = posi + 1; i < size; i++) {
            array2[i + 1] = array[i];
        }
        for (int n : array2) {
            System.out.print(n + " ");
        }

    }

}