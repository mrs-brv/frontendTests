package jsystems.cucumberTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class MainLoginPage extends HelperPage{
//    WebDriver driver;
    public MainLoginPage(WebDriver driver){
        super(driver);
    }
    public WebElement myMainPage = driver.findElement(By.id("search-component-1"));
    public WebElement avatar = driver.findElement(By.xpath("//*[@id=\"header\"]/a[3]/span/img"));


    public boolean isContentPresent(){
        assertTrue(myMainPage.isDisplayed());
        return true;
    }
}
