package jsystems.cucumberTest.step;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jsystems.cucumberTest.ConfigSteps;
import jsystems.cucumberTest.page.*;
import org.openqa.selenium.WebDriver;
import pages.DataTest;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;
    PasswordPage passwordPage;
    MainLoginPage mainLoginPage;
    PersonalPage personalPage;
    NotificationPage notificationPage;
    public  LoginSteps(ConfigSteps configSteps){
        try {
            driver = configSteps.setUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Given("^User is in wordpress website \"([^\"]*)\"$")
    public void userIsInWordpressWebsite(String website) throws Throwable {
        driver.get(website);
        mainPage = new MainPage(driver);
        assertTrue(mainPage.logIn.isDisplayed());
//        throw new PendingException();
    }

    @When("^User click login button$")
    public void userClickLoginButton() throws Throwable {
        mainPage.logIn.click();
//        throw new PendingException();
    }

    @Then("^User is on first login page$")
    public void userIsOnFirstLoginPage() throws Throwable {
        loginPage = new LoginPage(driver);
        assertTrue(loginPage.buttonContinue.isDisplayed());
//        throw new PendingException();
    }

    @When("^User enter login and press <continue>$")
    public void userEnterLoginAndPressContinue() throws Throwable {
        loginPage.usernameInput.sendKeys(DataTest.userLogin);
        loginPage.buttonContinue.click();
//        throw new PendingException();
    }

    @Then("^User is on password page$")
    public void userIsOnPasswordPage() throws Throwable {
        passwordPage = new PasswordPage(driver);
        passwordPage.passwordInput.isDisplayed();
        passwordPage.buttonLogIn.isDisplayed();
//        throw new PendingException();
    }

    @When("^User enter password and press <login>$")
    public void userEnterPasswordAndPressLogin() throws Throwable {
        passwordPage.passwordInput.sendKeys(DataTest.userPassword);
        passwordPage.buttonLogIn.click();
//        throw new PendingException();
    }

    @Then("^User is on his main page$")
    public void userIsOnHisMainPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        mainLoginPage =  new MainLoginPage(driver);
        assertTrue(mainLoginPage.myMainPage.isDisplayed());
//        throw new PendingException();
    }

    @When("^User press avatar$")
    public void userPressAvatar() throws Throwable {
        assertTrue(mainLoginPage.avatar.isDisplayed());
        mainLoginPage.avatar.click();
//        throw new PendingException();
    }

    @Then("^User is on personal page$")
    public void userIsOnPersonalPage() throws Throwable {
        personalPage = new PersonalPage(driver);
        assertTrue(personalPage.notification.isDisplayed());
//        throw new PendingException();
    }

    @When("^User clicks notification link$")
    public void userClicksNotificationLink() throws Throwable {
        personalPage.notification.click();
//        throw new PendingException();
    }

    @Then("^User is on notification page$")
    public void userIsOnNotificationPage() throws Throwable {
        notificationPage = new NotificationPage(driver);
        assertTrue(notificationPage.czyjestjakisbutton.isDisplayed());
//        throw new PendingException();
    }

    @When("^User clicks checkbox$")
    public void userClicksCheckbox() throws Throwable {
        assertTrue(notificationPage.firstCheckbox.isSelected());
//        throw new PendingException();
    }

    @Then("^User is unselected$")
    public void userIsUnselected() throws Throwable {
        notificationPage.firstCheckbox.click();
        notificationPage.logoutButton.click();
//        throw new PendingException();
    }
}
