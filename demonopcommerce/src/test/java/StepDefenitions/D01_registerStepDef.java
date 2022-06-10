package StepDefenitions;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static StepDefenitions.Hooks.driver;

public class D01_registerStepDef
{
    RegisterPage register;
    @Given("user open browser")
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Udacity course (Front end and performance Testing)\\Projects");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("user navigate to register page")
    public void RegisterPage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }


    @When("user enter valid data {string} and {string} and {string} and {string} and {string}")
    public void userEnterValidDataAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4)
    {
        register.firstnamePOM(driver).sendKeys("firstname");
        register.lastnamePOM(driver).sendKeys("lastname");
        register.emailPOM(driver).sendKeys("email");
        register.passwordPOM(driver).sendKeys("password");
        register.confirmpasswordPOM(driver).sendKeys("confirmpassword");
    }

    @Then("click on register button")
    public void registerbutton() throws InterruptedException {
        register.confirmpasswordPOM(driver).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("user could register successfully")
    public void registersuccessfully()
    {
       String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(register.flashPOM()).getText();
    }

    @And("user go to Home page")
    public void HomePage()
    {
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
    }
}
