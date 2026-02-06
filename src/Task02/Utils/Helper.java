package Task02.Utils;

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

}
