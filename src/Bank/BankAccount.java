package Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionHistory = new ArrayList<Transaction>();

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void deposit(double amount) {
        transactionHistory.add(new Transaction(new Date(), "deposit", amount));
        setBalance(this.balance + amount);
        //return balance;
    }

    public void withdrawal(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        transactionHistory.add(new Transaction(new Date(), "withdrawal", amount));
        setBalance(this.balance - amount);
        //return balance;
    }

    public void displayTransactionHistory() {
        for (int i = 0; i < transactionHistory.size(); i++) {
            System.out.println(transactionHistory.toString());
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }


    @Override
    public String toString() {
        return "Account Number: " + accountNumber + '\'' +
                " Balance: " + balance +
                " Transaction History: " + transactionHistory;
    }
}
