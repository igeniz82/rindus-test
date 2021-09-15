package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.CartPage;
import pom.HomePage;
import pom.ItemsPage;
import pom.SearchResults;

public class TestBase {

    protected ChromeDriver driver = hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected SearchResults searchResults = new SearchResults(driver);
    protected ItemsPage itemsPage = new ItemsPage(driver);
    protected CartPage cartPage = new CartPage(driver);
    protected Utils utils = new Utils();
}
