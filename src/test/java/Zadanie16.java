import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zadanie16 {
    private WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    // Test 1: Kliknij w JS Alert i zatwierdź
    public static void testJavaScriptAlert(WebDriver driver) {
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlertButton.click();

        // Przełącz się na alert
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Zatwierdź alert

        // Sprawdź, czy w result pojawił się napis "You successfully clicked an alert"
        WebElement result = driver.findElement(By.id("result"));
        if (result.getText().equals("You successfully clicked an alert")) {
            System.out.println("Test 1 zakończony powodzeniem.");
        } else {
            System.out.println("Test 1 zakończony niepowodzeniem.");
        }
    }

    // Test 2: Kliknij w JS Confirm i anuluj
    public static void testJavaScriptConfirm(WebDriver driver) {
        WebElement jsConfirmButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        jsConfirmButton.click();

        // Przełącz się na alert
        Alert alert = driver.switchTo().alert();
        alert.dismiss(); // Anuluj alert

        // Sprawdź, czy w result pojawił się napis "You clicked: Cancel"
        WebElement result = driver.findElement(By.id("result"));
        if (result.getText().equals("You clicked: Cancel")) {
            System.out.println("Test 2 zakończony powodzeniem.");
        } else {
            System.out.println("Test 2 zakończony niepowodzeniem.");
        }
    }
    // Test 3: Kliknij w JS Prompt, wpisz "Hej" i zatwierdź
    public static void testJavaScriptPrompt(WebDriver driver) {
        WebElement jsPromptButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPromptButton.click();

        // Przełącz się na alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hej"); // Wprowadź tekst do alertu
        alert.accept(); // Zatwierdź alert

        // Sprawdź, czy w result pojawił się napis "You entered: Hej"
        WebElement result = driver.findElement(By.id("result"));
        if (result.getText().equals("You entered: Hej")) {
            System.out.println("Test 3 zakończony powodzeniem.");
        } else {
            System.out.println("Test 3 zakończony niepowodzeniem.");
        }
    }
    @AfterTest
    public void afterTest(){
       // driver.close();
        //driver.quit();
    }
}
