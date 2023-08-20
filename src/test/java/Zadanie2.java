import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class Zadanie2 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }

    @Test
    public void checkIfTheNameFieldIsActive() {
        WebElement userNameInput = driver.findElement(By.name("account.firstName"));
        assertTrue(userNameInput.isDisplayed());
        assertFalse(!userNameInput.isDisplayed());
        assertEquals(userNameInput.getText(), "");
        userNameInput.sendKeys("Agnieszka");
        assertEquals(userNameInput.getAttribute("value"), "Agnieszka");
        userNameInput.clear();
        assertEquals(userNameInput.getAttribute("value"), "");

    }

    @AfterTest
    public void afterTest() {
         driver.close();
         driver.quit();
    }
}
