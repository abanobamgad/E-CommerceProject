package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage
{
    public RegisterPage(WebDriver driver)
    {

    }

    public WebElement firstnamePOM(WebDriver driver)
    {
        return driver.findElement(By.name("FirstName"));
    }

    public WebElement lastnamePOM(WebDriver driver)
    {
        return driver.findElement(By.name("LastName"));
    }

    public WebElement emailPOM (WebDriver driver)
    {
        return driver.findElement(By.name("Email"));

    }

    public WebElement passwordPOM (WebDriver driver)
    {
        return driver.findElement(By.name("Password"));
    }

    public WebElement confirmpasswordPOM (WebDriver driver)
    {
        return driver.findElement(By.name("ConfirmPassword"));
    }

    public By flashPOM ()
    {
        return By.id("flash");
    }
}
