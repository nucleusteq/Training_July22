package OperationsAndExpressions;

import java.util.Scanner;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c : ");
        double c = sc.nextDouble();

        double d = (b * b) - 4 * a * c;

        if (d > 0) {
            double r1 = -b + Math.sqrt(d) / 2 * a;
            double r2 = -b - Math.sqrt(d) / 2 * a;
            System.out.println("The two roots are r1: " + r1 + " and r2: " + r2);
        } else if (d == 0) {
            double root = -b / 2 * a;
            System.out.println("Root is : " + root);
        } else {
            System.out.println("No real roots");
        }

    }
}