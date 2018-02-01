package jsystems.cucumberTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class PersonalPage extends HelperPage{
//    WebDriver driver;
    public PersonalPage(WebDriver driver){
        super(driver);
    }
    public WebElement firstNameInput = driver.findElement(By.id("first_name"));
    public WebElement notification = driver.findElement(By.xpath("//*[@id=\"secondary\"]/ul/li[1]/ul/li[5]/a"));


    public boolean isContentPresent(){
        assertTrue(firstNameInput.isDisplayed());
        assertTrue(notification.isDisplayed());
        return true;
    }
}
