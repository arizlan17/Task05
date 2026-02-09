package Task02;

import Task02.Enums.AccountType;
import Task02.Utils.AccountFinder;
import Task02.Utils.CustomerFinder;
import Task02.Utils.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Bank {
    List <Customer> bankCustomers= new ArrayList<Customer>();
    List<BankAccount>bankAccounts = new ArrayList<BankAccount>();




    public static void main(String[] args) {



    }


    public void adCustomer(){
        String customerId = Helper.validateIdNumberInput("Enter Id Number - ","Re-Enter Valid Id Number - ");
        String customerName = Helper.validateStringInput("Enter Customer Name - ","Re-Enter Customer Name - ");
        String customerEmail = Helper.validateEmailInput("Enter Customer Email - ","Re-enter  a valid Email - ");
        String customerPhoneNumber = Helper.validatePhoneNumberInput("Enter Customer Phone Number","Re-Enter Valid Phone Number");
        Customer newCustomer = new Customer(customerId,customerName,customerEmail,customerPhoneNumber);
        System.out.println(newCustomer+ " - Customer Created" );
        bankCustomers.add(newCustomer);
    }

    public void deleteCustomer(){
        String IdNumber =Helper.validateIdNumberInput("Enter Customer Id Number - ","Re-Enter Valid Id Number - ");
        System.out.println(CustomerFinder.deleteCustomer(IdNumber,bankCustomers));
    }

    public void createAccount() {
        String IdNumber = Helper.validateIdNumberInput("Enter Customer Id Number - ", "Re-Enter Valid Id Number - ");
        Optional<Customer> searchedCustomer = CustomerFinder.getCustomer(IdNumber, bankCustomers);
        searchedCustomer.ifPresentOrElse(
                customer -> {
                    System.out.println("Customer Found - " + customer.getCustomerName());
                    String accountHolderName = customer.getCustomerName();
                    AccountType productType = Helper.validateAccountType();
                    double initialDeposite = Helper.validateDoubleInput("Enter the Initial Deposit Amount ; ", "Invalid Amount . Please Enter the Initial Deposit Amount :- ");
                    BankAccount newAccount = new BankAccount(customer, accountHolderName, initialDeposite, productType);
                    System.out.println( newAccount.toString() + " is Created.");
                    customer.setAccounts(newAccount);
                    bankAccounts.add(newAccount);

                }, () -> {
                    System.out.println("No Customer Found with the Entered IDNumber");
                }
        );

    }
        public void deleteAccount(){
            int AccountNumber = Helper.validateAccountNumberInput("Enter Customer Account Number - ", "Re-Enter Valid Account Number - ");
            AccountFinder.deleteBankAccount(String.valueOf(AccountNumber),bankAccounts);
        }

        public void getCustomerInfo(){
            String IdNumber = Helper.validateIdNumberInput("Enter Customer Id Number - ", "Re-Enter Valid Id Number - ");
            Optional<Customer> searchedCustomer = CustomerFinder.getCustomer(IdNumber, bankCustomers);
            searchedCustomer.ifPresentOrElse(
                    Customer::toString, () -> {
                        System.out.println("No Customer Found with the Entered IDNumber");
                    }
            );
        }

    public void getAccountInfo(){
        int AccountNumber = Helper.validateAccountNumberInput("Enter Customer Account Number - ", "Re-Enter Valid Account Number - ");
        Optional<BankAccount> searchedAccount = AccountFinder.getAccount(String.valueOf(AccountNumber), bankAccounts);
        searchedAccount.ifPresentOrElse(
                account->{
                    System.out.println(account.toString());

        }, () -> {
                    System.out.println("No Customer Found with the Entered IDNumber");
                }
        );
    }






}
