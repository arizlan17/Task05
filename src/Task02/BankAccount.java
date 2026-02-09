package Task02;

import Task02.Enums.AccountType;
import Task02.Utils.UniqueNumber;

public class BankAccount {
    private final int accountNumber;
    private String holderName;
    private double accountBalance;
    private AccountType accountType;
    private final Customer customer;
    //for later use - open account for existing customer

    public BankAccount( Customer customer,String holderName, double accountBalance, AccountType accountType) {
        this.accountNumber = UniqueNumber.generateAccountNumber(10000000,99999999);
        this.holderName = holderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.customer = customer;
    }

    public int getAccountNumber() {
        return accountNumber;
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

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountType=" + accountType +
                '}';
    }
}