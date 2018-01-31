package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "usernameOrEmail")
    public WebElement usernameInput;
    @FindBy(css = "button.form-button.is-primary")
    public WebElement buttonContinue;

}
