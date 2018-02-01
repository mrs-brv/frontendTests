package jsystems.cucumberTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class PasswordPage extends HelperPage{
//    WebDriver driver;
    public PasswordPage(WebDriver driver){
        super(driver);
    }
    public WebElement passwordInput = driver.findElement(By.id("password"));
    public WebElement buttonLogIn = driver.findElement(By.cssSelector("button.form-button.is-primary"));

    public boolean isContentPresent(){
        assertTrue(passwordInput.isDisplayed());
        return true;
    }
}