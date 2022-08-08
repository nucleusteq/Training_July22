package OperationsAndExpressions;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of base: ");
        double base = sc.nextDouble();
        System.out.println("Enter value of height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of triangle is : " + area);
    }
}