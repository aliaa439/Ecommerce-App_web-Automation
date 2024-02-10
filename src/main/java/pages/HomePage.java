package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserActions;

public class HomePage extends BasePage{
    By searhTextBox = By.id("small-searchterms");
    By searchButton = By.xpath("//input[@class=\"button-1 search-box-button\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public  void typeInsearchbox(String keys){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(searhTextBox));
        //driver.findElement(searhTextBox).sendKeys(text);
        BrowserActions.sendkeys(searhTextBox,driver,keys);
    }
    public  void clickONsearchbox(){
        //wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        //driver.findElement(searchButton).click();
        BrowserActions.clickElement(searchButton,driver);
    }



}
