class CriticalSec {
    private int readerCount = 0;

    public boolean readerEnter() throws InterruptedException {
        if(readerCount == 0) {
            readerCount++;
            Thread.sleep(5000);
            return true;
        }
        else if(readerCount == 1) {
            readerCount++;
            Thread.sleep(5000);
            readerCount = 0; // rewind to zero
            return true;
        }
        else {
            System.out.println("Both reader threads are busy, "+Thread.currentThread().getName()+" will not be executed");
            return false;
        }
    }

}

class Reader implements Runnable {

    private final CriticalSec cs;

    public Reader(CriticalSec criticalSec) {
        cs = criticalSec;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" goes for reading...");
        try {
            String state = cs.readerEnter() ? " done reading" : " failed reading!";
            System.out.println(Thread.currentThread().getName()+state);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class RWproblem {
    public static void main(String[] args) {
        CriticalSec c = new CriticalSec();

        Reader r1 = new Reader(c);
        Reader r2 = new Reader(c);
        Reader r3 = new Reader(c);

        new Thread(r1, "Reader 1").start();
        new Thread(r2, "Reader 2").start();
        new Thread(r3, "Reader 3").start();
    }
}
