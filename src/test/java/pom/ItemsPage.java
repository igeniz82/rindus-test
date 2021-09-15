package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemsPage extends BasePage{

    public ItemsPage(WebDriver driver){
        super(driver);
    }

    private By itemPrice = By.id("price_inside_buybox");
    private By qtyDropdown = By.className("a-dropdown-label");
    private By addToCartBtn = By.id("add-to-cart-button");
    private By goToCartBtn = By.id("nav-cart-text-container");

    public String getPrice() {
        String price = this.getText(itemPrice);
        return price;
    }

    public void clickQtyDropdown(){
        this.click(qtyDropdown);
    }
    public void clickAddToCart(){
        this.click(addToCartBtn);
    }
    public void clickGoToCart(){
        this.click(goToCartBtn);
    }
    public void selectItemDropdown(int option){
        List<WebElement> dropdownItems = driver.findElements(By.xpath("//li[@class= 'a-dropdown-item']"));
        dropdownItems.get(option-1).click();
    }
}
