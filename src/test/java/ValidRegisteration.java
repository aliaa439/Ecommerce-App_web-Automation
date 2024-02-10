import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterationPage;

public class ValidRegisteration extends BaseTest{
    @Test
    public void registeration() {
        HomePage homepage = new HomePage(driver);
        RegisterationPage rpage = new RegisterationPage(driver);
        rpage.clickonREGISTERbutton();

        rpage.choosegender();
        rpage.Typefirstname();
        rpage.Typelastname();
        rpage.SelectDateOfbirth();
        rpage.EnterEmailAndPassword("AliaaAhmed7777@yahoo.com","123456");
        rpage.FinalRegisteration();
        soft.assertEquals(rpage.RegisterationResult(),"Your registration completed");
    }
}
