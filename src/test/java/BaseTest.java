import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utilities.DriverSetup;

public class BaseTest {
    WebDriver driver;
    SoftAssert soft;
    @Test
    public void start(){
       /* WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        soft = new SoftAssert();
        driver.manage().window().maximize();*/
        driver= DriverSetup.setdriver("edge","https://demo.nopcommerce.com/");
        //driver.navigate().to("https://demo.nopcommerce.com/");
    }
    /*@AfterMethod
    public void closeDriver(){
        driver.close();
    }*/
}
