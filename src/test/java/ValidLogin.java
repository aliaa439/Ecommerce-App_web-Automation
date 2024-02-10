import org.testng.annotations.Test;
import pages.LoginPage;

public class ValidLogin extends BaseTest{
    @Test
    public void login(){

        LoginPage logpage = new LoginPage(driver);
        logpage.clickonLoginbutton();
        logpage.EnterEmail("AliaaAhmed7777@yahoo.com");
        logpage.EnterPassword("123456");
        logpage.Presslogin();

        soft.assertAll();
    }
}
