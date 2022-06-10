package StepDefenitions;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static StepDefenitions.Hooks.driver;

public class D02_loginStepDef
{
    LoginPage login;
    @Given("user open browser")
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Udacity course (Front end and performance Testing)\\Projects");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("user navigate to login page")
    public void loginpage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String arg0, String arg1)
    {

        login.userNamePOM(driver).sendKeys("username");
        login.passwordPOM(driver).sendKeys("password");
    }

    @Then("click on login button")
    public void loginbutton() throws InterruptedException {
        login.passwordPOM(driver).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }


    @Then("user go to home page")
    public void homepage()
    {
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
    }

}
