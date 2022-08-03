package inheritence;

import java.util.Date;
import java.util.Scanner;

public class Account {
    String name;
    String address;
    long accountNo;
    long balance;
    long phoneNo;
    Date db;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public Date getDb() {
        return db;
    }

    public void setDb(Date db) {
        this.db = db;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accountNo);

        System.out.println("Balance: " + balance);
    }

    public void closeAccount() {
        System.out.println("See You Soon");
    }

}

class SavingAccount extends Account {
    public void deposit() {
        long ammount;
        System.out.println("Enter the amount you want to deposit: ");
        ammount = sc.nextLong();
        balance = balance + ammount;
        System.out.println(balance);

    }

    // method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

}

class LoanAccount extends Account {
    public void payEmi() {
        long ammount;
        System.out.println("Enter the amount you want to pay: ");
        ammount = sc.nextLong();
        balance = balance - ammount;

    }

    public void repayment() {
        long ammount;
        System.out.println("Enter the amount you want to repay: ");
        ammount = sc.nextLong();
        balance = balance - ammount;

    }

}
