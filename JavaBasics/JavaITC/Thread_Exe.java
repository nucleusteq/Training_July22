import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread_Exe extends Thread implements Runnable {

private Person person;

public Thread_Exe(Person p) {
    this.person = p;
}
public static void main(String[] args) {

    Thread_Exe ts1 = new Thread_Exe(new Person("Aayushi"));
    ts1.start();
    Thread_Exe ts2 = new Thread_Exe(new Person("Reena"));
    ts2.start();
}
@Override
public void run() {
    for (int i = 0; i < 3; i++) {
        
            ATM acc = ATM.getAccount(person);
            acc.withdraw(100);           
            if (acc.getBal() < 0) {
                System.out.println("No amount in account");
            }
            acc.deposit(200);    
    }
    System.out.println("Final balance is Rs." + ATM.getBal());
}}