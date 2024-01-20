package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

/**
 * @author Nandkumar Babar
 */
public class BaseTest {

    public static WebDriver driver;

    public static void launchBrowser(){

        ChromeOptions chrome = new ChromeOptions();
        chrome.setBrowserVersion("stable");
//        chrome.setBrowserVersion("119");
        driver = new ChromeDriver(chrome);
        driver.get("https://practicetestautomation.com/");
        driver.manage().window().maximize();

    }
}