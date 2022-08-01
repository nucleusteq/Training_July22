package Money;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThreadEx extends Thread implements Runnable {
private Person person;

public ThreadEx(Person p) {
    this.person = p;
}

public static void main(String[] args) {

    ThreadEx ts1 = new ThreadEx(new Person("person 1"));
    ts1.start();
    ThreadEx ts2 = new ThreadEx(new Person("person 2"));
    ts2.start();
    ThreadEx ts3 = new ThreadEx(new Person("person 3"));
    ts3.start();

}

@Override
public void run() {
    for (int i = 0; i < 3; i++) {
        
            Account acc = Account.getAccount(person);
            acc.withdraw(100);
           
            if (acc.getBal() < 0) {
                System.out.println("account is empty!");
            }
            acc.deposit(200);
       
    }
    System.out.println("Final Account balance is Rs." + Account.getBal());
}}
