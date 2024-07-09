package org.example;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern = Pattern.compile(firstNamePattern);
        Matcher matcher = compiledPattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Valid first name.");
        }else{
            System.out.println("Invalid first name.");
        }
    }
}