package lesson1;
import java.util.Random;
import java.lang.invoke.LambdaMetafactory;
import java.util.Scanner;

//operations: deposit money, withdraw money, get current balance
//instance variables
//account number, balance, interest rate, bank, owner

public class BankAccount {
    public static void main(String[] args) {

    }
    Random ran = new Random();
    private double accountNumber;
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
        balance= initialBalance;
        owner = name;
        int random = ran.nextInt(0, 99999999);
        accountNumber = random;
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

    public double getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString(){
        return  String.format("Balance: $%.2f",balance);

    }

}