package POM;

import Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.*;
import java.util.*;

/**
 * @author Nandkumar Babar
 */
public class LoginPage extends BaseTest {

    //Page factory  / object repo.

//    input --> inp
// button --> btn
// link --> lnk
// text --> txt
// dropdown --> dd


    @FindBy(xpath = "//input[@name='username']") private WebElement inpUsername;
    @FindBy(xpath = "//input[@name='password']") private WebElement inpPassword;
    @FindBy(xpath = "//button[@id='submit']") private WebElement btnSubmit;


    public LoginPage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Methods
    public void enterCredentials(String username , String password){

        WebDriverWait wait = new WebDriverWait(BaseTest.driver,Duration.ofMinutes(2));
        wait.until(ExpectedConditions.visibilityOf(inpUsername)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(inpPassword)).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(btnSubmit)).click();

    }


}