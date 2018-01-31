import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;

import static org.junit.Assert.assertTrue;

public class LoginTest extends ConfigFrontend {
    MainPage mainPage;
    LoginPage loginPage;
    PasswordPage passwordPage;
    MainLoginPage mainLoginPage;
//    public String szukaj = "Get Started";
//    public String tosearch;
    @Test
    public void firstFrontendTest(){
        driver.get(baseUrl);
//        WebElement title = driver.findElement(By.cssSelector(".hp-hero__wrapper .no-widows"));
//        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"navbar-login-link\"]"));
//        WebElement logo = driver.findElement(By.id("wpcom-logo"));
//        WebElement getStartedTopBar = driver.findElement(By.className("menu-signup"));
//        System.out.println(tosearch);
//        assertTrue(tosearch.contains(szukaj));
//        WebElement getStaredMainPage = driver.findElement(By.cssSelector(".hp-hero__cta-container cta-container")).findElement(By.cssSelector(".is-cta"));
//        assertTrue(title.isDisplayed());
//        assertTrue(loginButton.isDisplayed());
//        assertTrue(logo.isDisplayed());
//        assertTrue(getStartedTopBar.isDisplayed());
//        assertTrue(getStaredMainPage.isDisplayed());
    }

    @Test
    public void testMainPage(){
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        mainPage.isContentPage();
    }
    @Test
    public void loginTest(){
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
        mainPage.loginButton.click();
        loginPage = new LoginPage(driver);
        loginPage.usernameInput.sendKeys(DataTest.userLogin);
        loginPage.buttonContinue.click();
        passwordPage = new PasswordPage(driver);
        passwordPage.passwordInput.sendKeys(DataTest.userPassword);
        passwordPage.buttonLogIn.click();
        passwordPage.webWait(passwordPage.passwordInput, 15);
        mainLoginPage = new MainLoginPage(driver);
        mainLoginPage.isContentPage();
        Thread.sleep(10000);

    }
}
