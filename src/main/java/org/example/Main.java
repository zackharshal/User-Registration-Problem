package org.example;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
        Matcher matcher1 = compiledPattern1.matcher(firstName);
        if(matcher1.matches()){
            System.out.println("Valid first name.");
        }else{
            System.out.println("Invalid first name.");
        }

        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern2 = Pattern.compile(lastNamePattern);
        Matcher matcher2 = compiledPattern2.matcher(lastName);
        if(matcher2.matches()){
            System.out.println("Valid last name.");
        }else{
            System.out.println("Invalid last name.");
        }

        System.out.print("Enter the email: ");
        String email = scanner.next();
        String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        Pattern compiledPattern3 = Pattern.compile(emailPattern);
        Matcher matcher3 = compiledPattern3.matcher(email);
        if(matcher3.matches()){
            System.out.println("Valid email.");
        }else{
            System.out.println("Invalid email.");
        }

        System.out.print("Enter the mobile number: ");
        scanner.nextLine();
        String mobileNumber = scanner.nextLine();
        String mobilePattern = "^\\d{2} \\d{10}$";
        Pattern compiledPattern4 = Pattern.compile(mobilePattern);
        Matcher matcher4 = compiledPattern4.matcher(mobileNumber);
        if(matcher4.matches()){
            System.out.println("Valid mobile number.");
        }else{
            System.out.println("Invalid mobile number.");
        }

        System.out.print("Enter the password: ");
        String password = scanner.next();
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        Pattern compiledPattern5 = Pattern.compile(passwordPattern);
        Matcher matcher5 = compiledPattern5.matcher(password);
        if(matcher5.matches()){
            System.out.println("Valid password.");
        }else{
            System.out.println("Invalid password.");
        }
    }
}