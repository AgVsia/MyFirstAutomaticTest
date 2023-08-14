import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;

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
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).isDisplayed());
    }

    @Test
    public void checkIfCatsOnLeftSideIsDisplayed() {
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/cats_icon.gif']")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/cats_icon.gif']")).isDisplayed());

    }

    @Test
    public void checkIfReptilesOnLeftSideIsDisplayed() {
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/reptiles_icon.gif']")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/reptiles_icon.gif']")).isDisplayed());


    }

    @Test
    public void checkIfSearchContentBarIsDisplayed() {
        assertTrue(driver.findElement(By.xpath("//*[@id='SearchContent']/form")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='SearchContent']/form")).isDisplayed());


    }

    @Test
    public void checkIfMainBirdImageIsDisplayed() {

        assertTrue(driver.findElement(By.xpath("//*[@id='MainImageContent']/map/area[1]")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='MainImageContent']/map/area[1]")).isDisplayed());

    }

    @Test
    public void checkIfSearchButtonHasTypeSubmit() {
        assertTrue(driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[2]")).isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[2]")).isDisplayed());
    }

    @Test
    public void checkIfSearchContentBarHasSize14() {
    assertTrue(driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[1]")).isDisplayed());
    assertFalse(!driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[1]")).isDisplayed());
    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
