package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResults extends BasePage {

    public SearchResults(WebDriver driver){
        super(driver);
    }



    private String pageTitle = "Amazon.com : hats for men";

    public String getPageTitle() {
        return pageTitle;
    }

    public boolean isSearchResultsDisplayed(){
        return this.getPageTitle().equals(pageTitle);
    }

    public void clickFirstItem(int option){
        List<WebElement> itemsFound = driver.findElements(By.xpath("//img[@class='s-image']"));
        itemsFound.get(option-1).click();
    }
}
