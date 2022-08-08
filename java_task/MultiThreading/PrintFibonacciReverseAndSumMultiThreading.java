package MultiThreading;

import java.util.Scanner;

public class PrintFibonacciReverseAndSumMultiThreading {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        FibonacciSeries fibonacciSeries = new FibonacciSeries(num);
        PrintReverse printReverse = new PrintReverse(num);
        SumOfNNumbers sumOfNNumbers = new SumOfNNumbers(num);

        System.out.println(sumOfNNumbers.getName() + " " + sumOfNNumbers.getState());
        fibonacciSeries.start();
        printReverse.start();
        sumOfNNumbers.start();
        // sumOfNNumbers.sleep(1000);
        // System.out.println("DDD"+sumOfNNumbers.getName()+"
        // "+sumOfNNumbers.getState());
        sc.close();

    }

}