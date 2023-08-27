import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class Zadanie6 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();

    }

    @Test
    public void uploadFileTest() {
        driver.navigate().to("https://the-internet.herokuapp.com/upload");
        WebElement uploadInputButton = driver.findElement(By.id("file-upload"));
        uploadInputButton.sendKeys("C:\\Users\\Asus\\OneDrive\\Pulpit\\TXT");
        WebElement uploadButton = driver.findElement(By.id ("file-submit"));
        uploadButton.click();
        WebElement uploadedFiles = driver.findElement(By.id("uploaded-files"));
        assertEquals(uploadedFiles.getText(),"TXT");

    }

    @AfterTest
    public void afterTest() {
        //  driver.close();
        // driver.quit();
    }

}
