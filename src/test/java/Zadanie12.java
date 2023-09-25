
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zadanie12 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {

        driver = new ChromeDriver();
    }

    @Test
    public void testDropdownSelection() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("2");

       String selectedText = dropdown.getFirstSelectedOption().getText();
       Assert.assertEquals(selectedText, "Option 2", "Nie wybrano opcji 2 z dropdown.");


    }

    @AfterTest
    public void afterTest() {
        //  driver.quit();
        // driver.close();
    }
}
