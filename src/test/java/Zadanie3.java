import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class Zadanie3 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }

    @Test
    public void checkIfTheAccountInformationFieldsAreEmpty() {
        WebElement userNameInput = driver.findElement(By.name("account.firstName"));
        assertTrue(userNameInput.isDisplayed());
        assertEquals(userNameInput.getText(), "");
        assertEquals(userNameInput.getAttribute("value"), "");
        userNameInput.sendKeys("Aga");
        //assertEquals(userNameInput.getAttribute("value"),"Aga");

        WebElement userLastNameInput = driver.findElement(By.name("account.lastName"));
        assertTrue(userLastNameInput.isDisplayed());
        assertEquals(userLastNameInput.getText(), "");
        assertEquals(userLastNameInput.getAttribute("value"), "");
        userLastNameInput.sendKeys("Bala");


        WebElement userEmailInput = driver.findElement(By.name("account.email"));
        assertTrue(userEmailInput.isDisplayed());
        assertEquals(userEmailInput.getText(), "");
        assertEquals(userEmailInput.getAttribute("value"), "");
        userEmailInput.sendKeys("aga@aga");


        WebElement userPhoneInput = driver.findElement(By.name("account.phone"));
        assertTrue(userPhoneInput.isDisplayed());
        assertEquals(userPhoneInput.getText(), "");
        assertEquals(userPhoneInput.getAttribute("value"), "");
        userPhoneInput.sendKeys("458796326");


        WebElement userAddress1Input = driver.findElement(By.name("account.address1"));
        assertTrue(userAddress1Input.isDisplayed());
        assertEquals(userAddress1Input.getText(), "");
        assertEquals(userAddress1Input.getAttribute("value"), "");
        userAddress1Input.sendKeys("Ludowa 1/22");


        WebElement userAddress2Input = driver.findElement(By.name("account.address2"));
        assertTrue(userAddress2Input.isDisplayed());
        assertEquals(userAddress2Input.getText(), "");
        assertEquals(userAddress2Input.getAttribute("value"), "");
        userAddress2Input.sendKeys("Roztocze 2/23");


        WebElement userCityInput = driver.findElement(By.name("account.city"));
        assertTrue(userCityInput.isDisplayed());
        assertEquals(userCityInput.getText(), "");
        assertEquals(userCityInput.getAttribute("value"), "");
        userCityInput.sendKeys("Lublin");


        WebElement userStateInput = driver.findElement(By.name("account.state"));
        assertTrue(userStateInput.isDisplayed());
        assertEquals(userStateInput.getText(), "");
        assertEquals(userStateInput.getAttribute("value"), "");
        userStateInput.sendKeys("Polska");


        WebElement userZipInput = driver.findElement(By.name("account.zip"));
        assertTrue(userZipInput.isDisplayed());
        assertEquals(userZipInput.getText(), "");
        assertEquals(userZipInput.getAttribute("value"), "");
        userZipInput.sendKeys("20-900");


        WebElement userCountryInput = driver.findElement(By.name("account.country"));
        assertTrue(userCountryInput.isDisplayed());
        assertEquals(userCountryInput.getText(), "");
        assertEquals(userCountryInput.getAttribute("value"), "");
        userCountryInput.sendKeys("Polska");

        WebElement saveAccountInformationButton = driver.findElement(By.name("newAccount"));
        assertTrue(saveAccountInformationButton.isDisplayed());
        saveAccountInformationButton.click();
    }

    @AfterTest
    public void afterTest() {
        // driver.close();
        // driver.quit();
    }
}
