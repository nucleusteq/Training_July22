package MultiThreading;

public class PrintThreads extends Thread {
    public void run() {
    }

    public static void main(String args[]) {
        SetThreadName t1 = new SetThreadName();
        SetThreadName t2 = new SetThreadName();
        SetThreadName t3 = new SetThreadName();
        SetThreadName t4 = new SetThreadName();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("Name of t3:" + t3.getName());
        System.out.println("Name of t4:" + t4.getName());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
