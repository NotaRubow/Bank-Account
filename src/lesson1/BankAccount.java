package lesson1;
import java.util.Random;

//operations: deposit money, withdraw money, get current balance
//instance variables
//account number, balance, interest rate, bank, owner

public class BankAccount {
    public static void main(String[] args) {

    }
    Random ran = new Random();
    private int accountNumber;
    private double balance;
    private double interestRate;
    private String bank;
    private String owner;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public BankAccount(double initialBalance, String name){
        Random random = new Random();
        balance= initialBalance;
        owner = name;
        accountNumber = 10000000 + random.nextInt(90000000);
        interestRate = 0.0;
    }
    /**
     * Deposits a specified amount of money into the
     * account
     * @param amount amount to deposit
     */

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public void changeOwner(String newOwner){
        owner = newOwner;
    }
    public void setInterestRate(double rate){
        interestRate = rate;
    }
    public void addInterest(){
        if (interestRate <= 0){
            double interest = balance * (interestRate/100);
            balance += interest;
        }

    }

    @Override
    public String toString(){
        return  String.format("Balance: $%.2f",balance);

    }

}