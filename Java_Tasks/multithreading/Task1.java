package MultiThreading;

import java.util.Scanner;

class Threads1 implements Runnable {
    public void run() {

        int a = 0, b = 1;
        System.out.print("Fibbonaccin no:" + a + " " + "Fibbonaccin no:" + b + " ");
        int i = 2;
        while (i < 5) {
            int s = a + b;
            System.out.print("Fibbonacci no: " + s);
            System.out.println();
            a = b;
            b = s;
            i++;
        }
    }
}

class Threads2 implements Runnable {
    public void run() {
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        for (int i = 5; i > 0; i--) {
            System.out.print("Reverse No: " + i + " ");
            System.out.println();

        }
    }
}

class Threads3 implements Runnable {
    public void run() {
        // Scanner sc= new Scanner(System.in);
        // int n= sc.nextInt();
        int sum = 0;
        for (int i = 1; i < 5; i++) {

            sum = sum + i;

        }
        System.out.println("Sum is: " + sum);
    }
}

public class Task1 {
    public static void main(String[] args) {

        Threads1 t1 = new Threads1();
        Thread tt1 = new Thread(t1);

        Threads2 t2 = new Threads2();
        Thread tt2 = new Thread(t2);

        Threads3 t3 = new Threads3();
        Thread tt3 = new Thread(t3);
        tt1.start();
        tt2.start();
        tt3.start();

    }

}
