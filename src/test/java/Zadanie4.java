import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Zadanie4 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }

    @Test
    public void verifyIfTheCheckBoxesAreUnchecked() {
        WebElement enableMyListCheckbox = driver.findElement(By.name("account.listOption"));
        assertTrue(enableMyListCheckbox.isDisplayed());
        assertFalse(enableMyListCheckbox.isSelected());

        WebElement enableMyBannerCheckbox = driver.findElement(By.name("account.bannerOption"));
        assertTrue(enableMyBannerCheckbox.isDisplayed());
        assertFalse(enableMyBannerCheckbox.isSelected());

        enableMyListCheckbox.click();
        assertTrue(enableMyListCheckbox.isSelected());
        assertFalse(enableMyBannerCheckbox.isSelected());

    }

    @AfterTest
    public void afterTest() {
        // driver.close();
        // driver.quit();
    }


}
