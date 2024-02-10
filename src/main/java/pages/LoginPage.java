package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class LoginPage extends BasePage{

    By Emailbox = By.id("Email");
    By Passwordbox = By.id("Password");
    By logbutt = By.xpath("//button[@class=\"button-1 login-button\"]");

    By welcomemessage =By.xpath("//div[@class=\"page-title\"]//h1");

    By errorloginmsg = By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void EnterEmail (String usedemail){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(Emailbox));
        //driver.findElement(Emailbox).sendKeys(usedemail);
        BrowserActions.sendkeys(Emailbox,driver,usedemail);
    }
    public void EnterPassword (String usedpassword){
        // wait.until(ExpectedConditions.visibilityOfElementLocated(Passwordbox));
        //driver.findElement(Passwordbox).sendKeys(usedpassword);
        BrowserActions.sendkeys(Passwordbox,driver,usedpassword);
    }
    public void Presslogin(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(logbutt));
        //driver.findElement(logbutt).click();
        BrowserActions.clickElement(logbutt,driver);
    }

    public String getWelcomemessage(){

        //wait.until(ExpectedConditions.visibilityOfElementLocated(welcomemessage));
        BrowserActions.waitElement(welcomemessage,driver);
        return driver.findElement(welcomemessage).getText();
    }

    public String getLoginError(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(errorloginmsg));
        BrowserActions.waitElement(errorloginmsg,driver);
        return driver.findElement(errorloginmsg).getText();
    }

}
