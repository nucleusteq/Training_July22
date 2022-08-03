package MultiThreading;

public class SetThreadName extends Thread {
    public void run() {
        System.out.print("Hello Thread  ");

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

        t1.setName("Sejal Jain");
        t2.setName("Nucleus Teq ");
        t3.setName("Software Developer Engineer");
        t4.setName("july-2022");

        System.out.println("After changing name of t1:" + t1.getName() + " and name of t2: " + t2.getName());
        System.out.println("After changing name of t3:" + t3.getName() + " and name of t4: " + t4.getName());

    }

}
