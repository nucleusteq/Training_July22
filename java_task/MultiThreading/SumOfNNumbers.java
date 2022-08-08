package MultiThreading;

public class SumOfNNumbers extends Thread {
    int num;

    SumOfNNumbers(int num) {
        this.num = num;
    }

    public void run() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum Of N Numbers: " + sum);
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
        } catch (Exception e) {

        }
    }
}