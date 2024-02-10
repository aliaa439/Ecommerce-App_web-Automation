package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class BasePage {
    WebDriver driver;
    //WebDriverWait wait;
    By loginButton= By.xpath("//a[@class=\"ico-login\"]");
    By registerbutton = By.xpath("//a[contains(@href,'register')]");


    public BasePage(WebDriver driver) {
        this.driver = driver;
        //wait = new WebDriverWait(driver,30);

    }

    public  void clickonLoginbutton (){
        BrowserActions.clickElement(loginButton,driver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        //driver.findElement(loginButton).click();
    }

    public void clickonREGISTERbutton(){
        BrowserActions.clickElement(registerbutton,driver);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(registerbutton));
        //driver.findElement(registerbutton).click();
    }
}
