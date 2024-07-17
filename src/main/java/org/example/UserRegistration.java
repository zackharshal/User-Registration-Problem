package org.example;

import java.util.regex.*;

public class UserRegistration {
    public boolean fName(String firstName) throws CustomException{
        if(firstName.isEmpty()){
            throw new IllegalArgumentException("Wrong input");
        }
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
        Matcher matcher1 = compiledPattern1.matcher(firstName);
        if(matcher1.matches()){
            return true;
        }else{
            throw new CustomException("Invalid first name");
        }
    }
    public boolean lName(String lastName) throws CustomException{
        if(lastName.isEmpty()){
            throw new IllegalArgumentException("Wrong input");
        }
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern2 = Pattern.compile(lastNamePattern);
        Matcher matcher2 = compiledPattern2.matcher(lastName);
        if(matcher2.matches()){
            return true;
        }else{
            throw new CustomException("Invalid last name");
        }
    }
    public boolean eMail(String email) throws CustomException{
        if(email.isEmpty()){
            throw new IllegalArgumentException("Wrong input");
        }
        String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        Pattern compiledPattern3 = Pattern.compile(emailPattern);
        Matcher matcher3 = compiledPattern3.matcher(email);
        if(matcher3.matches()){
            return true;
        }else{
            throw new CustomException("Invalid email");
        }
    }
    public boolean mNumber(String mobileNumber) throws CustomException{
        if(mobileNumber.isEmpty()){
            throw new IllegalArgumentException("Wrong input");
        }
        String mobilePattern = "^\\d{2} \\d{10}$";
        Pattern compiledPattern4 = Pattern.compile(mobilePattern);
        Matcher matcher4 = compiledPattern4.matcher(mobileNumber);
        if(matcher4.matches()){
            return true;
        }else{
            throw new CustomException("Invalid mobile number");
        }
    }

    public boolean passwordP(String password) throws CustomException{
        if(password.isEmpty()){
            throw new IllegalArgumentException("Wrong input");
        }
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        String specialCharacterPattern = "[@$!%*?&]";

        Pattern compiledPattern5 = Pattern.compile(passwordPattern);
        Pattern specialCharacterCompiledPattern = Pattern.compile(specialCharacterPattern);

        Matcher matcher5 = compiledPattern5.matcher(password);
        Matcher specialCharacterMatcher = specialCharacterCompiledPattern.matcher(password);

        int specialCharacterCount = 0;
        while (specialCharacterMatcher.find()) {
            specialCharacterCount++;
        }
        if (matcher5.matches() && specialCharacterCount == 1) {
            return true;
        }else {
            throw new CustomException("Invalid password");
        }
    }


    public static void main(String[] args) {

    }
}