package jsystems.cucumberTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class NotificationPage extends HelperPage {
//    WebDriver driver;
    public NotificationPage(WebDriver driver){
        super(driver);
    }
    public WebElement firstCheckbox = driver.findElement(By.xpath("//*[@id=\"primary\"]/main/div[3]/div/div[1]/div[2]/div[2]/ul/li[1]/input"));
    public WebElement czyjestjakisbutton = driver.findElement(By.xpath("//*[@id=\"primary\"]/main/div[3]/div/div[1]/div[2]/div[1]/ul"));
    public WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"secondary\"]/ul/div[2]/button"));


    public boolean isContentPresent(){
        assertTrue(firstCheckbox.isDisplayed());
        assertTrue(czyjestjakisbutton.isDisplayed());
        return true;
    }
}
