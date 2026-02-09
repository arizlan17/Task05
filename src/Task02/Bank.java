package Task02;

import Task02.Enums.AccountType;
import Task02.Utils.AccountFinder;
import Task02.Utils.CustomerFinder;
import Task02.Utils.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class Bank {
    List <Customer> bankCustomers= new ArrayList<Customer>();
    List<BankAccount>bankAccounts = new ArrayList<BankAccount>();

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        Bank myBank = new Bank();
        boolean systemRunning = true;

        while (systemRunning) {
            System.out.println("\n--- BANK MAIN MENU ---");
            System.out.println("1. Customer Management");
            System.out.println("2. Account Management");
            System.out.println("0. Exit System");
            System.out.println("\nEnter your choice:");

            String mainChoice = scanner.nextLine().trim();
            switch (mainChoice) {
                case "1":
                    runCustomerMenu(myBank);
                    break;
                case "2":
                    runAccountMenu(myBank);
                    break;
                case "0":
                    systemRunning = false;
                    System.out.println("Shutting down...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // Sub-menu for Customer actions
    private static void runCustomerMenu(Bank bank) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- CUSTOMER MANAGEMENT ---");
            System.out.println("1. Add New Customer");
            System.out.println("2. Delete Customer");
            System.out.println("3. View Customer Info");
            System.out.println("0. Back to Task01.Main Menu");
            System.out.println("\nEnter your choice:");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": bank.addCustomer();back = true; break;
                case "2": bank.deleteCustomer(); back = true;break;
                case "3": bank.getCustomerInfo();back = true; break;
                case "0": back = true; break;
                default: System.out.println("Invalid option.");
            }
        }
    }

    // Sub-menu for Account actions
    private static void runAccountMenu(Bank bank) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- ACCOUNT MANAGEMENT ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account Info");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. View Transaction History");
            System.out.println("0. Back to Task01.Main Menu");
            System.out.println("\nEnter your choice:");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": bank.createAccount();break;
                case "2": bank.deleteAccount(); break;
                case "3": bank.getAccountInfo();break;
                case "4": bank.depositToAccount(); break;
                case "5": bank.withdrawFromAccount(); break;
                case "6": bank.showTransactionHistory(); break;
                case "0": back = true; break;
                default: System.out.println("Invalid option.");
            }
        }
    }


    public void addCustomer(){
        String customerId = Helper.validateIdNumberInput("Enter Id Number - ","Re-Enter Valid Id Number (123456789V)- ");
        String customerName = Helper.validateStringInput("Enter Customer Name - ","Re-Enter Customer Name - ");
        String customerEmail = Helper.validateEmailInput("Enter Customer Email - ","Re-enter a valid Email (xxxx@gmail.com)- ");
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
        String IdNumber = Helper.validateIdNumberInput("Enter Customer Id Number - ", "Re-Enter Valid Id Number(123456789V) - ");
        Optional<Customer> searchedCustomer = CustomerFinder.getCustomer(IdNumber, bankCustomers);
        searchedCustomer.ifPresentOrElse(
                customer -> {
                    System.out.println("Customer Found - " + customer.getCustomerName()+"\nProceeding to Create Account for this Customer.........\n");
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
                    Customer->{
                        System.out.println(Customer.toString());}, () -> {
                        System.out.println("No Customer Found with the Entered IDNumber");
                    }
            );
        }

    public void getAccountInfo(){
        int AccountNumber = Helper.validateAccountNumberInput("Enter Customer Account Number - ", "Re-Enter Valid Account Number - ");
        Optional<BankAccount> searchedAccount = AccountFinder.getAccount(AccountNumber, bankAccounts);
        searchedAccount.ifPresentOrElse(
                account->{
                    System.out.println(account.toString());

        }, () -> {
                    System.out.println("No Account Found with the Entered Account Number");
                }
        );
    }

    /**
     * Allows a user to deposit money into their account
     */
    public void depositToAccount() {
        int accountNumber = Helper.validateAccountNumberInput("Enter Account Number - ", "Re-Enter Valid Account Number - ");
        Optional<BankAccount> searchedAccount = AccountFinder.getAccount(accountNumber, bankAccounts);
        searchedAccount.ifPresentOrElse(
                account -> {
                    System.out.println("Account Found - Holder: " + account.getHolderName());
                    double depositAmount = Helper.validateDoubleInput("Enter Deposit Amount - ", "Invalid Amount. Please Enter a Valid Deposit Amount - ");
                    account.deposit(depositAmount);
                },
                () -> System.out.println("No Account Found with the Entered Account Number")
        );
    }

    /**
     * Allows a user to withdraw money from their account
     */
    public void withdrawFromAccount() {
        int accountNumber = Helper.validateAccountNumberInput("Enter Account Number - ", "Re-Enter Valid Account Number - ");
        Optional<BankAccount> searchedAccount = AccountFinder.getAccount(accountNumber, bankAccounts);
        searchedAccount.ifPresentOrElse(
                account -> {
                    System.out.println("Account Found - Holder: " + account.getHolderName());
                    System.out.println("Current Balance: $" + account.getAccountBalance());
                    double withdrawAmount = Helper.validateDoubleInput("Enter Withdrawal Amount - ", "Invalid Amount. Please Enter a Valid Withdrawal Amount - ");
                    account.withdraw(withdrawAmount);
                },
                () -> System.out.println("No Account Found with the Entered Account Number")
        );
    }

    /**
     * Display the transaction history for a specific account
     */
    public void showTransactionHistory() {
        int accountNumber = Helper.validateAccountNumberInput("Enter Account Number - ", "Re-Enter Valid Account Number - ");
        Optional<BankAccount> searchedAccount = AccountFinder.getAccount(accountNumber, bankAccounts);
        searchedAccount.ifPresentOrElse(
                BankAccount::viewTransactionHistory,
                () -> System.out.println("No Account Found with the Entered Account Number")
        );
    }
}

