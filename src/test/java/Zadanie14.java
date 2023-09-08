import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class Zadanie14 {
        private WebDriver driver;

        @BeforeTest
        public void beforeTest() {

            driver = new ChromeDriver();
        }

        @Test
        public void testKeyPress() {

            driver.get("https://the-internet.herokuapp.com/key_presses");
            WebElement inputElement = driver.findElement(By.id("target"));
            inputElement.click();
            inputElement.sendKeys(Keys.DOWN);

            WebElement resultElement = driver.findElement(By.id("result"));
            String resultText = resultElement.getText();
            Assert.assertEquals(resultText, "You entered: DOWN", "Nie wyświetlono oczekiwanego tekstu.");
        }

        @AfterTest
        public void afterTest() {
            driver.quit();
        }
    }

