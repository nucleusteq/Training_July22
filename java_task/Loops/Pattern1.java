package Loops;

import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}