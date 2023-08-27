import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Zadanie7 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to(" http://the-internet.herokuapp.com/hovers");
    }

    @Test
    public void hoverTest() {
        WebElement firstAvatar = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
        WebElement secondAvatar = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/img"));
        WebElement thirdAvatar = driver.findElement(By.xpath("//*[@id='content']/div/div[3]/img"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstAvatar).perform();
        WebElement nameOfFirstAvatar = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
        assertEquals(nameOfFirstAvatar.getText(), "name: user1");
        assertEquals(secondAvatar.getText(), "");
        assertEquals(thirdAvatar.getText(), "");

        actions.moveToElement(secondAvatar).perform();
        WebElement nameOfSecondAvatar = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        assertEquals(nameOfSecondAvatar.getText(), "name: user2");
        assertEquals(firstAvatar.getText(), "");
        assertEquals(thirdAvatar.getText(), "");

        actions.moveToElement(thirdAvatar).perform();
        WebElement nameOfThirdAvatar = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5"));
        assertEquals(nameOfThirdAvatar.getText(), "name: user3");
        assertEquals(firstAvatar.getText(), "");
        assertEquals(secondAvatar.getText(), "");

    }

    @AfterTest
    public void afterTest() {
        //  driver.close();
        //  driver.quit();
    }

}
