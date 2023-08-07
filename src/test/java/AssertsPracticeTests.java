import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AssertsPracticeTests {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action");
    }
    @Test
    public void checkIfFishOnLeftSideIsDisplayed() {

        assertTrue(driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).isDisplayed());
        assertEquals(driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).getAttribute("src"), "https://petstore.octoperf.com/images/fish_icon.gif");

    }

    @Test
    public void checkIfDogsOnLeftSideIsDisplayed() {
    }

    @Test
    public void checkIfCatsOnLeftSideIsDisplayed() {

    }

    @Test
    public void checkIfReptilesOnLeftSideIsDisplayed() {

    }

    @Test
    public void checkIfSearchContentBarIsDisplayed() {

    }

    @Test
    public void checkIfMainBirdImageIsDisplayed() {

    }

    @Test
    public void checkIfSearchButtonHasTypeSubmit() {

    }

    @Test
    public void checkIfSearchContentBarHasSize14() {

    }

    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
