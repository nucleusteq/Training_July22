package Arrrays;

import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of first matrix");
        int m = sc.nextInt();
        int matrix1[][] = new int[m][m];
        int matrix2[][] = new int[m][m];
        System.out.println("Enter Elements of matrix1");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements of matrix2");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int addMatrix[][] = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(addMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
