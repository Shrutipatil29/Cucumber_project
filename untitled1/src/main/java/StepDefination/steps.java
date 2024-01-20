package StepDefination;

import POM.HomePage;
import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Nandkumar Babar
 */
public class steps {

    @Given("Navigates to login page")
    public void navigates_to_login_page() throws Exception {
        HomePage hm = new HomePage();
        hm.navigatesToLoginPage();

    }

    @When("Enters the valid username and password")
    public void enters_the_valid_username_and_password() {
        LoginPage lp = new LoginPage();
        lp.enterCredentials("student","Password123");

    }

    @Then("Verify the user status")
    public void verify_the_user_status() throws Exception {

        HomePage hm = new HomePage();
        hm.verifyTheLogin();

    }
    @When("Enters the invalid username and invalid password")
    public void enters_the_invalid_username_and_invalid_password() {
        LoginPage lp = new LoginPage();
        lp.enterCredentials("1234@#","@#$%");
    }
    @Then("Verify the user status for invalid cred")
    public void verify_the_user_login_status() throws Exception {

        HomePage hm = new HomePage();
        hm.verifyTheLogin();

}}