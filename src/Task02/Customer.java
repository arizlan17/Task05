package Task02;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private  String  customerId;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;
    private List<BankAccount> accounts;

    public Customer(String customerId, String phoneNumber, String emailAddress, String customerName) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.customerName = customerName;
        this.accounts = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount account) {
        this.accounts.add(account);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accounts=" + accounts.toString()+
                '}';
    }
}
