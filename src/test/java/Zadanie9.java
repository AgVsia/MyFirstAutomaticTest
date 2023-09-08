import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Zadanie9 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();

    }

    @Test
    public void checkIfTheUserIsLogged() {
        driver.navigate().to("https://the-internet.herokuapp.com/digest_auth");

        WebElement usernameBox = driver.findElement(By.name("Username"));
        WebElement passwordBox = driver.findElement(By.name("Password"));
        WebElement loginButton = driver.findElement(By.name("Sign in"));
        Actions actions = new Actions(driver);
        actions.sendKeys(usernameBox, "admin").sendKeys(passwordBox, "admin").click(loginButton).perform();

        WebElement successMessage = driver.findElement(By.cssSelector("div#flash"));
        String messageText = successMessage.getText();
        assertEquals(messageText, "Congratulations! You must have the proper credentials.");

    }

    @AfterTest

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}