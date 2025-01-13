package lesson1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(50, "Nathan Rubow");
        System.out.println(myAccount.getBalance());
        myAccount.deposit(10);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(30);
        System.out.println(myAccount.getBalance());
        System.out.println("Account name: " +myAccount.getOwner());
        System.out.println("Account number: " + myAccount.getAccountNumber());

    }
}
