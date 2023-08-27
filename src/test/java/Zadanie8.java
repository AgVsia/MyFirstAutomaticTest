import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Zadanie8 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/context_menu");

    }

    @Test
    public void checkIfAlertInfoIdDisplayed(){
        WebElement boxMessage =  driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
        Actions actions = new Actions(driver);
        actions.contextClick(boxMessage).build().perform();
        driver.switchTo().alert().accept();

    }
    @AfterTest
    public void afterTest(){
        //driver.close();
        //driver.quit();
    }

}
