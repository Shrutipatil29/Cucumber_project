package POM;

import Base.*;
import Utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

import java.time.*;
import java.util.*;

/**
 * @author Nandkumar Babar
 */
public class HomePage extends BaseTest {

    //Page factory  / object repo.

//    input --> inp
// button --> btn
// link --> lnk
// text --> txt
// dropdown --> dd

    @FindBy(xpath = "//a[text()='Practice']") private List<WebElement> btnPractice;
    @FindBy(xpath = "//a[text()='Test Login Page']") private List<WebElement> btnLoginPage;
    @FindBy(xpath = "//h1[text()='Logged In Successfully']") private List<WebElement> txtLogin;


    public HomePage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Methods

    public void navigatesToLoginPage() throws Exception {

        WebDriverWait wait =new WebDriverWait(BaseTest.driver, Duration.ofMinutes(2));
        wait.until(ExpectedConditions.visibilityOf(btnPractice.get(0))).click();
        wait.until(ExpectedConditions.visibilityOf(btnLoginPage.get(0))).click();

    }

    public void verifyTheLogin() throws Exception {
//
//        if (!(txtLogin.size()>0)){
//            throw new Exception("Page is not navigates on home page");
//        }

        //Common approach
        Assert.assertEquals(txtLogin.get(0).getText(),"Logged In Successfully");

    }

}