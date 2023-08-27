import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Zadanie5 {
    private WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");

    }

    @Test
    public void selectLanguageOnLanguagePreferenceLabel() {
        WebElement selectElement = driver.findElement(By.name("account.languagePreference"));
        Select select = new Select(selectElement);

        String initialLanguage = "english";
        String expectedJapaneseLanguage = "japanese";
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, initialLanguage);

        select.selectByVisibleText("japanese");

        String selectedJapaneseOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedJapaneseOption, expectedJapaneseLanguage);

        select.selectByVisibleText("english");

        selectedOption =select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption,initialLanguage);

    }

    @AfterTest
    public void afterTest() {
        // driver.close();
        // driver.quit();
    }


}
