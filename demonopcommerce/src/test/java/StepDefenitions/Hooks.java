package StepDefenitions;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    public static WebDriver driver = null;

LoginPage login;
RegisterPage register;


    @Before
    public void openBrowser()
    {
      System.setProperty("webdriver.chrome.driver","D:\\Udacity course (Front end and performance Testing)\\Projects");

      driver = new ChromeDriver();

      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

      driver.navigate().to("https://demo.nopcommerce.com/");

      login = new LoginPage(driver);
      register = new RegisterPage(driver);
    }

    @After
    public void quitDriver()
    {
        driver.quit();
    }
}
