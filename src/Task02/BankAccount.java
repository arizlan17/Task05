package Task02;

import Task02.Enums.accountType;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double accountBalance;
    private accountType accountType;
    private Customer customer;
    //for later use - open account for existing customer

    public BankAccount(int accountNumber, String holderName, double accountBalance, accountType accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public accountType getAccountType() {
        return accountType;
    }

    public void setAccountType(accountType accountType) {
        this.accountType = accountType;
    }
}