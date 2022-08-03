package inheritence;

public class User extends SavingAccount {

    /**
     * @param args
     */
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Roy";
        u1.accountNo = 97868857;
        u1.balance = 1000000;
        u1.showAccount();
        u1.deposit();
        u1.withdrawal();
        u1.closeAccount();

    }
}
