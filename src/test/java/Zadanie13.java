import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zadanie13 {
    private WebDriver driver;

    @BeforeTest

    public void beforeTest() {
        driver = new ChromeDriver();

    }

    @Test

    public void testExitIntentModal() {

        driver.get("https://the-internet.herokuapp.com/exit_intent");

        Actions actions = new Actions(driver);


        actions.moveByOffset(0, 500).perform();


        WebElement modalElement = driver.findElement(By.id("myModal"));
        Assert.assertTrue(modalElement.isDisplayed(), "Modal nie został wyświetlony.");


        WebElement closeButton = driver.findElement(By.cssSelector(".modal-footer .btn"));
        closeButton.click();

        Assert.assertFalse(modalElement.isDisplayed(), "Modal nie został zamknięty.");
    }

    @AfterTest
    public void afterTest() {
       // driver.quit();
    }
}


