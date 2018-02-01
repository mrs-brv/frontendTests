package jsystems.cucumberTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;

public class LoginPage extends HelperPage {
//    WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);
    }
    public WebElement usernameInput = driver.findElement(By.id("usernameOrEmail"));
    public WebElement buttonContinue = driver.findElement(By.cssSelector("button.form-button.is-primary"));
    public boolean isContentPresent(){
        assertTrue(usernameInput.isDisplayed());
        return true;
    }
}

