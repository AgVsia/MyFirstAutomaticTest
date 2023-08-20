import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class Zadanie4 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver= new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }
    @Test
    public void verifyIfTheCheckBoxesAreUnchecked(){
        WebElement enableMyListCheckbox=driver.findElement(By.name("account.listOption"));
        assertTrue(enableMyListCheckbox.isDisplayed());
        assertTrue(enableMyListCheckbox.isEnabled());
        enableMyListCheckbox.click();

        WebElement enableMyBanner=driver.findElement(By.name("account.bannerOption"));
        assertTrue(enableMyListCheckbox.isDisplayed());
        assertTrue(enableMyListCheckbox.isEnabled());
    }



}
