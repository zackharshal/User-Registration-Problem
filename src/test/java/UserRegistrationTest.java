import org.example.CustomException;
import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {
    static UserRegistration test = new UserRegistration();
    @Test
    public void validFirstNameTest(){
        try{
            Assert.assertTrue(test.fName("Harshal"));
        }catch (CustomException e){
            Assert.fail("Exception should not have been thrown");
        }
    }
    @Test
    public void invalidFirstNameTest(){
        try{
            test.fName("harshal");
            Assert.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assert.assertEquals("Invalid first name", e.getMessage());
        }
    }

    @Test
    public void validLastNameTest(){

        try{
            Assert.assertTrue(test.lName("Gotarne"));
        }catch (CustomException e){
            Assert.fail("Exception should not have been thrown");
        }
    }

    @Test
    public void invalidLastNameTest(){
        try{
            test.lName("gotarne");
            Assert.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assert.assertEquals("Invalid last name", e.getMessage());
        }
    }

    @Test
    public void validEmailTest(){
        try{
            Assert.assertTrue(test.eMail("harshal.gotarne@gmail.com"));
        }catch (CustomException e){
            Assert.fail("Exception should not have been thrown");
        }

    }

    @Test
    public void invalidEmailTest(){
        try{
            test.eMail("harshal");
            Assert.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assert.assertEquals("Invalid email", e.getMessage());
        }
    }

    @Test
    public void validMobileNumberTest(){
        try{
            Assert.assertTrue(test.mNumber("91 8433878127"));
        }catch (CustomException e){
            Assert.fail("Exception should not have been thrown");
        }

    }
    @Test
    public void invalidMobileNumberTest(){
        try{
            test.mNumber("8433878127");
            Assert.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assert.assertEquals("Invalid mobile number", e.getMessage());
        }
    }

    @Test
    public void validPasswordTest(){
        try{
            Assert.assertTrue(test.passwordP("Harshal*25"));
        }catch (CustomException e){
            Assert.fail("Exception should not have been thrown");
        }
    }
    @Test
    public void invalidPasswordTest(){
        try{
            test.passwordP("harshal");
            Assert.fail("Expected Custom Exception");
        }catch (CustomException e){
            Assert.assertEquals("Invalid password", e.getMessage());
        }

    }



    @ParameterizedTest
    @ValueSource(strings = {
            "nitish.prjapati@gmail.com",
            "harshal.gotarne@gmail.com",
            "amruta.shinde@gmail.com",
            "anjali.patil@gmail.com"
    })

    public void validEmail(String mail){
        try{
            Assert.assertTrue(test.eMail(mail));
        }catch (CustomException e){
            Assert.fail("Exception should not have been thrown");
        }
    }
}
