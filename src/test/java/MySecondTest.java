import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MySecondTest {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }
    @Test
    public void mySecondTest() {

        driver.navigate().to("https://selenium.dev/");
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.contains("Selenium"));

    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
