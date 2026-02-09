package Task02.Utils;

import Task02.Enums.AccountType;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Helper {
    private static Scanner scanner = new Scanner(System.in);
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";


    public static String validateStringInput(String prompt, String ReenterPrompt){
        System.out.println(prompt);//Enter the Name
        String variableValue = scanner.nextLine().trim();
        while(variableValue.isEmpty()){
            System.out.println(ReenterPrompt);
            variableValue = scanner.nextLine();
        }
        return variableValue;
    }

    public static String validateEmailInput(String prompt, String ReenterPrompt){

        while(true){
            System.out.println(prompt);
            String validEmail = scanner.nextLine().trim();
            if (Pattern.matches(EMAIL_REGEX,validEmail)){
                return validEmail;
            }else {
            System.out.println(ReenterPrompt);
        }}
    }


    public static String validatePhoneNumberInput(String prompt, String ReenterPrompt){

        while(true){
            System.out.println(prompt);
            String PhoneNumber = scanner.nextLine().trim();
            if (PhoneNumber.matches("^\\d{10}$")){
                return PhoneNumber;
            }else {
            System.out.println(ReenterPrompt);
        }}
    }


    public static String validateIdNumberInput(String prompt, String ReenterPrompt){

        while(true){
            System.out.println(prompt);
            String IdNum = scanner.nextLine().trim();
            if (IdNum.matches("^\\d{10}v$")){
                return IdNum;
            }else {
                System.out.println(ReenterPrompt);
            }}
    }


    public static int validateIntInput(String prompt, String ReenterPrompt){
        int validNumber;
        System.out.println(prompt);

        while(true){
            try{
                validNumber = scanner.nextInt();
                scanner.nextLine();
                return validNumber;
            }catch (InputMismatchException e){
                System.out.println(ReenterPrompt);
            }
        }
    }

    public static double validateDoubleInput(String prompt, String ReenterPrompt){
        double validNumber;
        System.out.println(prompt);

        while(true){
            try{
                validNumber = Double.parseDouble(scanner.nextLine().trim());
                return validNumber;
            }catch (InputMismatchException e){
                System.out.println(ReenterPrompt);
            }
        }
    }

    public static AccountType validateAccountType(){
        while (true){
            System.out.println("Select the Number fot Relevant Product - ");
            AccountType[] types = AccountType.values();
            for (int i = 0; i < types.length; i++) {
                System.out.println(types[i].toString() + (" -> ") + (i + 1));
            }
            String selectedProductNumber = scanner.nextLine().trim();
            try {
                int choice =  Integer.parseInt(selectedProductNumber);
                if (choice > 0 && choice< types.length){
                    return types[choice-1];
                }else {
                    System.out.println("Invalid Selection. Please Choose a valid Number .");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Selection. Please Choose a valid Number .");
            }
        }
    }


    public static int validateAccountNumberInput(String prompt, String ReenterPrompt){
        int validNumber;
        System.out.println(prompt);

        while(true){
            try{
                String InputNumber = scanner.nextLine().trim();
                if((InputNumber.length()>=8)) {
                    validNumber = Integer.parseInt(InputNumber);
                    return validNumber;
                }else {
                    System.out.println(ReenterPrompt);
                }
            }catch (InputMismatchException e){
                System.out.println(ReenterPrompt);
            }
        }
    }


}
