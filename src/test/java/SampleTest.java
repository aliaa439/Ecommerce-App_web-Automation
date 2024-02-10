import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class SampleTest extends BaseTest{
    @Test
    public void SampleTest() {
        HomePage home = new HomePage(driver);
        home.clickonLoginbutton();
        LoginPage login =new LoginPage(driver);
        soft.assertEquals(login.getWelcomemessage(),"Welcome, Please Sign In!");
        soft.assertAll();
    }
}
