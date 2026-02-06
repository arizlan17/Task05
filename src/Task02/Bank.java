package Task02;

import Task02.Utils.Helper;

import java.util.ArrayList;
import java.util.List;


public class Bank {
    List <Customer> bankCustomers= new ArrayList<Customer>();




    public static void main(String[] args) {

    }


    public void AddCustomers(){
        String customerName = Helper.validateStringInput("Enter Customer Name - ","Re-Enter Customer Name - ");
        String customerEmail = Helper.validateEmailInput("Enter Customer Email - ","Re-enter  a valid Email - ");
        String customerPhoneNumber = Helper.validatePhoneNumberInput("Enter Customer Phone Number","Re-Enter Valid Phone Number");
        Customer newCustomer = new Customer(customerName,customerEmail,customerPhoneNumber);
        System.out.println(newCustomer+ " - Customer Created" );

    }
}
