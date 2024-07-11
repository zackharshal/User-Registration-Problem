import org.example.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationTest {

    @Test
    public void fNameTest(){
        UserRegistration test = new UserRegistration();
        String result = test.fName("Nitish");
        Assert.assertEquals("HAPPY", result);

    }

    @Test
    public void lNameTest(){
        UserRegistration test = new UserRegistration();
        String result = test.lName("Prajapati");
        Assert.assertEquals("HAPPY", result);

    }

    @Test
    public void emailTest(){
        UserRegistration test = new UserRegistration();
        String result = test.eMail("nitish.prajapati@gmail.com");
        Assert.assertEquals("HAPPY", result);

    }

    @Test
    public void numberTest(){
        UserRegistration test = new UserRegistration();
        String result = test.mNumber("91 7652079588");
        Assert.assertEquals("HAPPY", result);

    }


    @Test
    public void passwordTest(){
        UserRegistration test = new UserRegistration();
        String result = test.passwordP("Nitish*13");
        Assert.assertEquals("HAPPY", result);
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "nitish.prjapati@gmail.com",
            "harshal.gotarne@gmail.com",
            "amruta.shinde@gmail.com",
            "anjali.patil@gmail.com"
    })

    public void validEmail(String mail){
        UserRegistration test = new UserRegistration();
        String result = test.eMail(mail);
        Assert.assertEquals(result, "HAPPY");
    }


}
