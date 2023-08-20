import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class Zadanie1 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }

    @Test
    public void checkIfTheUserIdFieldIsEmpty() {
        WebElement userIdInput = driver.findElement(By.name("username"));
        assertTrue(userIdInput.isDisplayed());
        assertFalse(!userIdInput.isDisplayed());
        assertEquals(userIdInput.getText(), "");
        userIdInput.sendKeys("76687");
        assertEquals(userIdInput.getAttribute("value"), "76687");

    }

    @AfterTest
    public void afterTest() {
      //  driver.close();
       // driver.quit();
    }

}
