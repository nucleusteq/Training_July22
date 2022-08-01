package thread;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ThreadAssessment extends Thread implements Runnable {
private People person;
public ThreadAssessment(people p) {
    this.person = p;
}
public static void main(String[] args) {
    ThreadAssessment ts1 = new ThreadAssessment(new people("Rohan"));
    ts1.start();
    ThreadAssessment ts2 = new ThreadAssessment(new people("Sohan"));
    ts2.start();
   
}
@Override
public void run() {
    for (int i = 0; i < 3; i++) {
        
            BankAccount acc = BankAccount.getAccount(person);
            acc.withdraw(100);
           
            if (acc.getBal() < 0) {
                System.out.println("account is empty!");
            }
            acc.deposit(200);
       
    }
    System.out.println("Final Account balance is Rs." + BankAccount.getBal());
}}