import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Zadanie11 {
    private WebDriver driver;

    @BeforeTest
    public void BeforeTest() {
        driver = new ChromeDriver();

    }

    @Test
    public void testDragAndDrop() {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement elementB = driver.findElement(By.id("column-b"));
        WebElement elementA = driver.findElement(By.id("column-a"));

        Actions builder = new Actions(driver);
        builder.dragAndDrop(elementB, elementA).perform();

        WebElement textInColumnA = driver.findElement(By.xpath("//div[@id='column-a']/header"));
        assertEquals("B", textInColumnA.getText());
    }

    @AfterTest
    public void afterTest() {
        //driver.quit();
        //driver.quit();
    }
}






