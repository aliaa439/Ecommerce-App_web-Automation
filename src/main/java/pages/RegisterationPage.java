package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class RegisterationPage extends BasePage{
    By chooseFemalegender = By.cssSelector("input#gender-female");
    By Firstnamebox = By.xpath("//input[@id='FirstName']");
    By Lastnamebox = By.xpath("//input[@id='LastName']");
    By dayofbirth = By.xpath("//select[@name='DateOfBirthDay']");
    By MONTHofbirth = By.xpath("//select[@name='DateOfBirthMonth']//child::option[2]");
    By yearofbirth = By.xpath("//select[@name='DateOfBirthYear']");
    By mailbox = By.xpath("//input[@id='Email']");
    By passwordbox = By.xpath("//input[@id=\"Password\"]");
    By confirmpassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    By finalregisterbutton = By.xpath("//button[@id=\"register-button\"]");
    By registerationResultmsg = By.xpath("//div[@class='result']");

    By existmail = By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li");

    public RegisterationPage(WebDriver driver) {
        super(driver);
    }


    public void choosegender (){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(chooseFemalegender));
        //driver.findElement(chooseFemalegender).click();
        BrowserActions.clickElement(chooseFemalegender,driver);
    }
    public void Typefirstname(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(Firstnamebox));
        //driver.findElement(Firstnamebox).sendKeys("Aliaa");
        BrowserActions.sendkeys(Firstnamebox,driver,"Alyaa");

    }
    public void Typelastname(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(Lastnamebox));
        //driver.findElement(Lastnamebox).sendKeys("Ahmed");
        BrowserActions.sendkeys(Lastnamebox,driver,"Ahmed");
    }

    public void SelectDateOfbirth(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(dayofbirth));
        BrowserActions.waitElement(dayofbirth,driver);
        Select selectdayofbirth = new Select(driver.findElement(dayofbirth));
        selectdayofbirth.selectByValue("4");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(MONTHofbirth));
        //driver.findElement(MONTHofbirth).click();
        BrowserActions.clickElement(MONTHofbirth,driver);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(yearofbirth));
        BrowserActions.waitElement(yearofbirth,driver);
        Select selectyearofbirth = new Select(driver.findElement(yearofbirth));
        selectyearofbirth.selectByValue("2001");
    }

    public void EnterEmailAndPassword(String usedemail, String usedpassword){

        BrowserActions.sendkeys(mailbox,driver,usedemail);
        BrowserActions.sendkeys(passwordbox,driver,usedpassword);
        BrowserActions.sendkeys(confirmpassword,driver,usedpassword);
    }
    public void FinalRegisteration(){
        BrowserActions.clickElement(finalregisterbutton,driver);
    }
    public String RegisterationResult(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(registerationResultmsg));
        BrowserActions.waitElement(registerationResultmsg,driver);
        return driver.findElement(registerationResultmsg).getText();

    }
    public String ExistEmailmsg(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(existmail));
        BrowserActions.waitElement(existmail,driver);
        return driver.findElement(existmail).getText();
    }
}
