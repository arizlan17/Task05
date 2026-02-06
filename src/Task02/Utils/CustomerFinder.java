package Task02.Utils;

import Task02.Customer;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerFinder {
    static Scanner scanner = new Scanner(System.in);


    public static String deleteCustomer(String CustomerId, List<Customer> customerList){
        Long searchedCustomer = customerList.stream().filter(customer -> Objects.equals(customer.getCustomerId(), CustomerId)).count();
        if (searchedCustomer < 1){
            return "Customer Not Found";
        }else {
            while(true){
                System.out.println("Confirm Deleting This User - All Related Accounts will be deleted \n" +
                        "If Yes - Y / No - n");
                String Confirmation = scanner.nextLine().trim();
                if (Confirmation.equalsIgnoreCase("Y")){
                    customerList.removeIf(customer -> Objects.equals(customer.getCustomerId(), CustomerId) );
                    return "Customer Deleted from the Database";
                }
                if (Confirmation.equalsIgnoreCase("N")){
                    customerList.removeIf(customer -> Objects.equals(customer.getCustomerId(), CustomerId) );
                    return "Customer Not Deleted from the Database";
                }

            }
        }
    }


}
