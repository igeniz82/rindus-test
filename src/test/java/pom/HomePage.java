package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    private String pageTitle = "Amazon.com. Gasta menos. Sonríe más.";
    private By searchBox = By.id("twotabsearchtextbox");
    private By btnSearch = By.id("nav-search-submit-button");

    public String getPageTitle(){
        return pageTitle;
    }

    public boolean homePageIsDisplayed(){
        return this.getPageTitle().equals(pageTitle);
    }

    public void clickBtnSearch(){
        this.click(btnSearch);
    }

    public void enterSearchText(String text){
        this.sendKeys(searchBox, text);
    }
}
