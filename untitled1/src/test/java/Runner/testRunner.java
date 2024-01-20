package Runner;


import Base.*;
import io.cucumber.testng.*;
import org.testng.annotations.*;


@CucumberOptions(
        features = "src/test/java/Feature",
        glue = "StepDefination",
        monochrome = true,
        tags = "@Login_123"
)




public class testRunner extends AbstractTestNGCucumberTests   {

    @BeforeClass
    public void preCondtions(){
        //Pre-Condtions
        BaseTest.launchBrowser();
    }

    @AfterClass
    public void PostCondtions() throws InterruptedException {
        Thread.sleep(5000);
        //Post-Condtion
        BaseTest.driver.quit();
    }

}