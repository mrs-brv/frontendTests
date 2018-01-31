package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class MainPage extends BasePage{
    WebDriver driver;

    public MainPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".hp-hero__wrapper .no-widows" )
    public WebElement titleMainPage;
    @FindBy(xpath = "//*[@id=\"navbar-login-link\"]")
    public WebElement loginButton;
    @FindBy(id = "wpcom-logo")
    public WebElement logo;
    @FindBy(className = "menu-signup")
    public WebElement getGetStartedTopBar;
    @FindBy(id = "hp-hero-cta")
    public WebElement getGetStaredMainPage;
//    WebElement title = driver.findElement(By.cssSelector(".hp-hero__wrapper .no-widows"));
//    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"navbar-login-link\"]"));
//    WebElement logo = driver.findElement(By.id("wpcom-logo"));
//    WebElement getStartedTopBar = driver.findElement(By.className("menu-signup"));
//    WebElement getStaredMainPage = driver.findElement(By.id("hp-hero-cta");
    public boolean isContentPage() {
        assertTrue(driver.getTitle().equals(DataTest.wordpressTitle));
        assertTrue(titleMainPage.isDisplayed());
        assertTrue(titleMainPage.getText().equals(DataTest.wordpressMainText));
        assertTrue(loginButton.isDisplayed());
        return true;
    }
}
