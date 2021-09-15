package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(By element){
        driver.findElement(element).click();
    }

    public boolean isDisplayed(By element){
        return driver.findElement(element).isDisplayed();
    }

    public String getText(By element){
        return driver.findElement(element).getText();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void sendKeys(By element, String keys){
        driver.findElement(element).sendKeys(keys);
    }
}
