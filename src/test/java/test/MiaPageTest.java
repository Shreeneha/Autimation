package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MiaPage;
import testbase.WebTestBase;

public class MiaPageTest extends WebTestBase {
    HomePage homePage;
    MiaPage miaPage;
    public MiaPageTest(WebDriver driver){
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage(driver);
        miaPage = new MiaPage(driver);

    }
    @Test
    public void VerifyiapageButton(){
        homePage.MiaClick();
    }

    @Test
    public void verifyAlert(){

    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
