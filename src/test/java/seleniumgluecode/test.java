package seleniumgluecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class test extends TestBase{

    Double price;
    int quantity;
    Double originalPrice;

    @Given("^I am in Amazon website$")
    public void iAmInAmazonWebsite() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^I perform a search for \"([^\\\"]*)\"$")
    public void iPerformASearchForN(String search) throws Throwable {
        homePage.enterSearchText(search);
        homePage.clickBtnSearch();
    }

    @And("^I am redirected to search results page$")
    public void iAmRedirectedToSearchResultsPage() throws Throwable {
        Assert.assertTrue(searchResults.isSearchResultsDisplayed());
    }

    @And("^I select the first item$")
    public void iSelectTheFirstItem() throws Throwable {
        searchResults.clickFirstItem(1);
        this.originalPrice = utils.getPriceFormat(itemsPage.getPrice());
    }

    @And("Add (\\d+) to the shopping cart$")
    public void addNToTheShoppingCart(int qty) throws Throwable{
        itemsPage.clickQtyDropdown();
        itemsPage.selectItemDropdown(qty);
        itemsPage.clickAddToCart();
        this.quantity = qty;
    }

    @And("^I go to the shopping cart$")
    public void iGoToTheShoppingCart() throws Throwable{
        itemsPage.clickGoToCart();
    }

    @Then("^The price and quantity are right$")
    public void thePriceAndQuantityAreRight() throws Throwable{
        Double cartPrice = utils.getPriceFormat(cartPage.getPrice());
        int cartQuantity = utils.getQuantityFormat(cartPage.getQuantity());
        this.price = this.originalPrice * this.quantity;
        Assert.assertEquals(this.price, cartPrice);
        Assert.assertEquals(this.quantity, cartQuantity);
    }

    @And("^I change quantity to (\\d+)$")
    public void iChangeQuantityTo(int qty) throws Throwable{
        cartPage.clickQtyDropdown();
        cartPage.selectItemDropdown(qty);
        this.quantity = qty;
        this.price = this.price * this.quantity;
    }
}
