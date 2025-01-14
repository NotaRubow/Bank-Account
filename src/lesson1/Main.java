package lesson1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500, "Nathan Rubow", 3);
        System.out.println("Current Balance: $" + myAccount.getBalance());
        myAccount.setTransactionFee(2);
        myAccount.deposit(10);
        myAccount.withdraw(30);
        myAccount.deposit(100);
        myAccount.withdraw(50);
        myAccount.deposit(250);
        myAccount.withdraw(65);
        System.out.println(myAccount.getBalance());
        System.out.println("Account name: " +myAccount.getOwner());
        System.out.println("Account number: " + myAccount.getAccountNumber());
        System.out.println("Balance before monthly fee: $" + myAccount.getBalance());
        myAccount.deductMonthlyFee();
        System.out.println("Final Balance after monthly fee deducted: $" + myAccount.getBalance());



    }
}
