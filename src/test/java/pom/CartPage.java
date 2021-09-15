package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver){
        super(driver);
    }

    private By itemPrice = By.xpath("//span[@id= 'sc-subtotal-amount-activecart']//span[@class= 'a-size-medium a-color-base sc-price sc-white-space-nowrap']");
    private By qtyDropdown = By.className("a-dropdown-prompt");

    public void clickQtyDropdown(){
        this.click(qtyDropdown);
    }
    public String getPrice() {
        WebDriverWait wait = new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-action='delete']")));
        return this.getText(itemPrice);
    }
    public void selectItemDropdown(int option){
        List<WebElement> dropdownItems = driver.findElements(By.xpath("//li[@class= 'a-dropdown-item quantity-option']"));
        dropdownItems.get(option).click();
    }

}
