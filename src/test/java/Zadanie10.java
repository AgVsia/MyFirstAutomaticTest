import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Zadanie10 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test public void testNegativeCase() {
        driver.get("https://the-internet.herokuapp.com/digest_auth");
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));

        usernameField.sendKeys("admin");
        passwordField.sendKeys("niepoprawne_haslo");
        loginButton.click();

        WebElement messageElement = driver.findElement(By.xpath("//p[contains(text(), 'Invalid credentials')]"));
        assertTrue(messageElement.isDisplayed());
    }

    @AfterTest
    public void afterTest() {
        //driver. close();
        //driver.quit();
        }
    }


