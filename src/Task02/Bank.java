package Task02;

import Task02.Utils.CustomerFinder;
import Task02.Utils.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank {
    List <Customer> bankCustomers= new ArrayList<Customer>();




    public static void main(String[] args) {

    }


    public void AddCustomer(){
        String customerId = Helper.validateIdNumberInput("Enter Id Number - ","Re-Enter Valid Id Number - ");
        String customerName = Helper.validateStringInput("Enter Customer Name - ","Re-Enter Customer Name - ");
        String customerEmail = Helper.validateEmailInput("Enter Customer Email - ","Re-enter  a valid Email - ");
        String customerPhoneNumber = Helper.validatePhoneNumberInput("Enter Customer Phone Number","Re-Enter Valid Phone Number");
        Customer newCustomer = new Customer(customerId,customerName,customerEmail,customerPhoneNumber);
        System.out.println(newCustomer+ " - Customer Created" );
        bankCustomers.add(newCustomer);
    }

    public void DeleteCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Id Number - ");
        String IdNumber =Helper.validateIdNumberInput("Enter Id Number - ","Re-Enter Valid Id Number - ");
        System.out.println(CustomerFinder.deleteCustomer(IdNumber,bankCustomers));


    }
}
