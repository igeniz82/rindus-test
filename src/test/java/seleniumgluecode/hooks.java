package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {

    private static ChromeDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
    }

    @After
//    public void closeBrowser(){
//        driver.quit();
//    }

    public static ChromeDriver getDriver(){
        return driver;
    }

}
