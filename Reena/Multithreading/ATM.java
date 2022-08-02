public class ATM {
public static ATM account;
private static int amount = 1000;
private static People people;

public static ATM getAccount(people p) {
    if (account == null) {
        account = new ATM();
    }
    ATM.people = p;
    return account;
}

public static int getBal() {
    return amount;
}
public synchronized void deposit(int balance) {
    if (balance > 0) {
        System.out.println(people.getName() +" " +"is trying to deposit");
        amount = amount + balance;
        System.out.println(people.getName() +" "+ "is complete the deposit");
    } else {
        System.out.println(people.getName() + " " + "doesn't have enough money for deposit");
    }
    System.out.println(people.getName() + " " + " deposit Rs." + amount);   
}
public synchronized void withdraw(int balance) {
        if (amount >= balance) {
            System.out.println(people.getName() + " " + "is try to withdraw");
            amount = amount - balance;
            System.out.println(people.getName() + " " + "is complete the withdraw");
        } else {
            System.out.println(people.getName() + " " + "doesn't have enough money for withdraw ");
        }
        System.out.println(people.getName() + " " + " withdraw Rs." + amount);
}

}