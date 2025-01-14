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
    private String owner;
    private double transtactionFee;
    private int freeTransactions;
    private int transactionCount;
    private double monthlyFee;
    public String getBalance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public BankAccount(double initialBalance, String name, int freeTransactionsPerMonth){
        Random random = new Random();
        balance= initialBalance;
        owner = name;
        accountNumber = 10000000 + random.nextInt(90000000);
        interestRate = 0.0;
        transtactionFee = 0.0;
        freeTransactions = freeTransactionsPerMonth;
        transactionCount = 0;
        monthlyFee = 0;
    }
    /**
     * Deposits a specified amount of money into the
     * account
     * @param amount amount to deposit
     */
    private void trackTransaction(){
        transactionCount ++;
        if (transactionCount > freeTransactions){
            monthlyFee += transtactionFee;
        }
    }
    public void deductMonthlyFee() {
            if (monthlyFee <= balance) {
                balance -= monthlyFee;
                System.out.println("Deducted monthly transaction fee: $" + monthlyFee);
            }
        transactionCount = 0; 
        monthlyFee = 0.0;
    }
    public void deposit(double amount) {
        if (amount>transtactionFee){
            balance += amount - transtactionFee;
            trackTransaction();
        }
        else{
            System.out.println("Deposit must be exeed transaction fee.");
        }
    }

    public void withdraw(double amount) {
        if (amount + transtactionFee <= balance){
            balance -= amount + transtactionFee;
            trackTransaction();
        }
        else{
            System.out.println("you cannot do this.");
        }
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
    public void setTransactionFee(double fee){
        transtactionFee = fee;
    }
    @Override
    public String toString(){
        return  String.format("Balance: $%.2f",balance);

    }

}