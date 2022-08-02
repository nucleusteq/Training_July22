package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread extends Thread implements Runnable {

private People people;

public Thread(People p) {
    this.people = p;
}
public static void main(String[] args) {

	Thread ts1 = new Thread(new People("Reena"));
    ts1.start();
    Thread ts2 = new Thread(new People("Aayushi"));
    ts2.start();
}
@Override
public void run() {
    for (int i = 0; i < 3; i++) {
        
            ATM acc = ATM.getAccount(people);
            acc.withdraw(100);           
            if (acc.getBal() < 0) {
                System.out.println("No amount in account");
            }
            acc.deposit(200);    
    }
    System.out.println("Final balance is Rs." + ATM.getBal());
}}