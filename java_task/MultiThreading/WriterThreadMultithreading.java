package MultiThreading;

import java.util.Scanner;

public class WriterThreadMultithreading extends Thread {
    // String data;
    public WriterThreadMultithreading() {
        // this.data=data;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Something");
        String data = sc.nextLine();
        ReaderWriterMultithreading.data = data;
        System.out.println("Teacher Thread Id: " + Thread.currentThread().getId() + " "
                + Thread.currentThread().getName() + " have written successfully");
        sc.close();

    }
}