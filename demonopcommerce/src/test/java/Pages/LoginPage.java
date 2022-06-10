package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
    public LoginPage(WebDriver driver) {
    }

    public WebElement userNamePOM (WebDriver driver)
    {
       return driver.findElement(By.name("Email"));

    }

    public WebElement passwordPOM (WebDriver driver)
    {
        return driver.findElement(By.name("Password"));
    }
}
