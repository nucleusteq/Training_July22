package Arrrays;

import java.util.Scanner;

class RotatingAnArray {

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
    }

    public static void leftRotate(int arr[], int d) {
        int n = d % arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (n >= arr.length) {
                n = 0;
            }
            System.out.print(arr[n++] + " ");
        }
    }

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