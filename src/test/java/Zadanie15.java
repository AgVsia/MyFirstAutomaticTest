import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zadanie15 {
    private WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void addAnfRemoveElements() {
        driver.get(" https://the-internet.herokuapp.com/add_remove_elements/");

        Actions actions = new Actions(driver);
        int initialElementCount = 0;
        for (int i = 0; i < 10; i++) {
            WebElement addElementButton = driver.findElement(By.cssSelector("#content > div > button"));
            actions.click(addElementButton).perform();
            initialElementCount++;

        }
        for (int i = 0; i<7; i++){
            WebElement deleteButton = driver.findElement(By.cssSelector("#elements > button:nth-child(1)"));
            actions.click(deleteButton).perform();
            initialElementCount--;

        }
        int currentElementCount = driver.findElements(By.id("elements")).size();
        if (currentElementCount==3) {
            System.out.println("Test przeszedł ok. Wyświetlają się 3 elementy");
        } else {
            System.out.println("Test nie jest ok. Zamaist 3 elementow wyświetla się " + currentElementCount + "elementów");
        }

    }
    @AfterTest
    public void afterTest() {
        // driver.close();
        // driver.quit();
    }
}
