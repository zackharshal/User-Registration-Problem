package org.example;

import java.util.regex.*;

public class UserRegistration {
    public String fName(String firstName){
        String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
        Matcher matcher1 = compiledPattern1.matcher(firstName);
        if(matcher1.matches()){
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
    public String lName(String lastName){
        String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern2 = Pattern.compile(lastNamePattern);
        Matcher matcher2 = compiledPattern2.matcher(lastName);
        if(matcher2.matches()){
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
    public String eMail(String email){
        String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        Pattern compiledPattern3 = Pattern.compile(emailPattern);
        Matcher matcher3 = compiledPattern3.matcher(email);
        if(matcher3.matches()){
            return "HAPPY";
        }else{
            return "SAD";
        }
    }
    public String mNumber(String mobileNumber){
        String mobilePattern = "^\\d{2} \\d{10}$";
        Pattern compiledPattern4 = Pattern.compile(mobilePattern);
        Matcher matcher4 = compiledPattern4.matcher(mobileNumber);
        if(matcher4.matches()){
            return "HAPPY";
        }else{
            return "SAD";
        }
    }

    public String passwordP(String password){
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
            return "HAPPY";
        }else {
            return "SAD";
        }
    }

//    public String test(String fname, String lname, String email, String pnumber, String password){
//        if(fName(fname) && lName(lname) && eMail(email) && mNumber(pnumber) && passwordP(password)){
//            return "HAPPY";
//        }else{
//            return "SAD";
//        }
//    }
    public static void main(String[] args) {

    }
}