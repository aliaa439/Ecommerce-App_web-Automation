import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLogin extends BaseTest{
    @Test
    public void failedlog (){

        LoginPage logpage = new LoginPage(driver);
        logpage.clickonLoginbutton();
        logpage.EnterEmail("AliaaAhmed333@yahoo.com");
        logpage.EnterPassword("123");
        logpage.Presslogin();

        soft.assertEquals(logpage.getLoginError(),"No customer account found");
    }
}
