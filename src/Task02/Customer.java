package Task02;

import Task02.Utils.uniqueNumber;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String  customerId;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;
    private List<BankAccount> accounts;

    public Customer( String customerName, String emailAddress, String phoneNumber) {
        this.customerId= String.valueOf(uniqueNumber.generateCustomerId());
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList<>();
    }


    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
