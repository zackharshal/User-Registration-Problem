package org.example;
import java.util.function.Predicate;
import java.util.regex.*;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
    private static final String PHONE_PATTERN = "^\\d{2} \\d{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";


    public static boolean validate(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public boolean fName(String firstName) throws CustomException{
        Predicate<String> validateFirstName = name -> validate(name, NAME_PATTERN);
        if(validateFirstName.test(firstName)){
            return true;
        }else{
            throw new CustomException("Invalid first name");
        }
    }
    public boolean lName(String lastName) throws CustomException{
        Predicate<String> validateLastName = name -> validate(name, NAME_PATTERN);
        if(validateLastName.test(lastName)){
            return true;
        }else{
            throw new CustomException("Invalid last name");
        }
    }
    public boolean eMail(String email) throws CustomException{
        Predicate<String> validateEmail = e -> validate(e, EMAIL_PATTERN);
        if(validateEmail.test(email)){
            return true;
        }else{
            throw new CustomException("Invalid email");
        }
    }
    public boolean mNumber(String mobileNumber) throws CustomException{
        Predicate<String> validatePhone = phone -> validate(phone, PHONE_PATTERN);
        if(validatePhone.test(mobileNumber)){
            return true;
        }else{
            throw new CustomException("Invalid mobile number");
        }
    }

    public boolean passwordP(String password) throws CustomException{
        Predicate<String> validatePassword = pass -> validate(pass, PASSWORD_PATTERN);
        if (validatePassword.test(password)) {
            return true;
        }else {
            throw new CustomException("Invalid password");
        }
    }


    public static void main(String[] args) {

    }
}