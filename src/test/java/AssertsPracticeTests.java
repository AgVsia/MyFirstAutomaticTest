import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement fishOnLeftSide = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
        assertTrue(fishOnLeftSide.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).isDisplayed());
        assertFalse(!fishOnLeftSide.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).isDisplayed());
        assertEquals(fishOnLeftSide.getAttribute("src"), "https://petstore.octoperf.com/images/fish_icon.gif");
        assertEquals(driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).getAttribute("src"), "https://petstore.octoperf.com/images/fish_icon.gif");

    }

    @Test
    public void checkIfDogsOnLeftSideIsDisplayed() {
        WebElement dogsOnLeftSide = driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']"));//*[@id="stripes--522082763"]
        assertTrue(dogsOnLeftSide.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).isDisplayed());
        assertFalse(!dogsOnLeftSide.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).isDisplayed());
    }

    @Test
    public void checkIfCatsOnLeftSideIsDisplayed() {
        WebElement catsOnLeftSide = driver.findElement(By.xpath("//img[@src='../images/cats_icon.gif']"));
        assertTrue(catsOnLeftSide.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/cats_icon.gif']")).isDisplayed());
        assertFalse(!catsOnLeftSide.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/cats_icon.gif']")).isDisplayed());

    }

    @Test
    public void checkIfReptilesOnLeftSideIsDisplayed() {
        WebElement reptilesOnLeft= driver.findElement(By.xpath("//img[@src='../images/reptiles_icon.gif']"));
        assertTrue(reptilesOnLeft.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//img[@src='../images/reptiles_icon.gif']")).isDisplayed());
        assertFalse(!reptilesOnLeft.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//img[@src='../images/reptiles_icon.gif']")).isDisplayed());


    }

    @Test
    public void checkIfSearchContentBarIsDisplayed() {
        WebElement searchContentBar = driver.findElement(By.xpath("//*[@id='SearchContent']/form"));
        assertTrue(searchContentBar.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id='SearchContent']/form")).isDisplayed());
        assertFalse(!searchContentBar.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='SearchContent']/form")).isDisplayed());


    }

    @Test
    public void checkIfMainBirdImageIsDisplayed() {

        WebElement mainBirdImage = driver.findElement(By.xpath("//*[@id='MainImageContent']/map/area[1]"));
        assertTrue(mainBirdImage.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id='MainImageContent']/map/area[1]")).isDisplayed());
        assertFalse(!mainBirdImage.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='MainImageContent']/map/area[1]")).isDisplayed());

    }

    @Test
    public void checkIfSearchButtonHasTypeSubmit() {
        WebElement searchButtonHasTypeSubmit = driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[2]"));
        assertTrue(searchButtonHasTypeSubmit.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[2]")).isDisplayed());
        assertFalse(!searchButtonHasTypeSubmit.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[2]")).isDisplayed());

        assertEquals(searchButtonHasTypeSubmit.getAttribute("type"),"submit");
    }

    @Test
    public void checkIfSearchContentBarHasSize14() {
        WebElement searchContentBarHasSize14 = driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[1]"));
        assertTrue(searchContentBarHasSize14.isDisplayed());
        assertTrue(driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[1]")).isDisplayed());
        assertFalse(!searchContentBarHasSize14.isDisplayed());
        assertFalse(!driver.findElement(By.xpath("//*[@id='SearchContent']/form/input[1]")).isDisplayed());
        assertEquals(searchContentBarHasSize14.getAttribute("size"),"14");
    }

    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
