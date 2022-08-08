package Loops;

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sumOfDigits = 0;
        while (temp > 0) {
            int r = temp % 10;
            sumOfDigits += r * r * r;
            temp = temp / 10;
        }
        if (num == sumOfDigits) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not An Armstrong Number");
        }
    }
}