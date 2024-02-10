import org.testng.annotations.Test;
import pages.RegisterationPage;

public class InvalidRegisteration extends BaseTest{
    @Test
    public void failRegister(){
        RegisterationPage rpage = new RegisterationPage(driver);
        rpage.clickonREGISTERbutton();

        rpage.choosegender();
        rpage.Typefirstname();
        rpage.Typelastname();
        rpage.SelectDateOfbirth();
        rpage.EnterEmailAndPassword("AliaaAhmed222@yahoo.com","123456");
        rpage.FinalRegisteration();
        soft.assertEquals(rpage.ExistEmailmsg(),"The specified email already exists");
    }
}
