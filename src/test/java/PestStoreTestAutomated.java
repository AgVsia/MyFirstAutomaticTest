import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PestStoreTestAutomated {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }

    @Test
    public void searchingLocators() {

        driver.navigate().to("https://petstore.octoperf.com/actions/Catalog.action ");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a/img"));
        driver.findElement(By.cssSelector("#LogoContent > a > img"));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[1]/img"));
        driver.findElement(By.partialLinkText("Sign In"));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div"));
        driver.findElement(By.cssSelector("//*[@id=\"SidebarContent\"]/a[1]/img"));
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/form/input[2]"));
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
        driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img"));
        driver.findElement(By.linkText("<img src=\"../images/sm_dogs.gif\">"));
        driver.findElement(By.cssSelector("#QuickLinks > a:nth-child(5) > img"));
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[4]/img"));
        driver.findElement(By.partialLinkText("/html/body/div[1]/div[4]/a[5]/img"));
        driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/img"));
        driver.findElement(By.cssSelector("#SidebarContent > a:nth-child(1) > img"));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/a[2]/img"));
        driver.findElement(By.partialLinkText("images/cats_icon.gif\">"));
        driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img"));
        driver.findElement(By.cssSelector("#SidebarContent > a:nth-child(13) > img"));
        driver.findElement(By.cssSelector("#PoweredBy > a"));

    }
}

