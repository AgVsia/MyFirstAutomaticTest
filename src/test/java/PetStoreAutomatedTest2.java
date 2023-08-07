import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PetStoreAutomatedTest2{
    private WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
    }
    @Test
    public void searchingLocators() {


        driver.navigate().to("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[1]/td[1]"));
        driver.findElement(By.xpath("//input[@name='username']"));
        driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(2) > tbody > tr:nth-child(2) > td:nth-child(1)"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[2]/td[2]/input"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[1]/tbody/tr[3]/td[1]"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[1]"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input"));
        driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(2) > td:nth-child(1)"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[1]"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input"));
        driver.findElement(By.linkText("Phone:"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[1]"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input"));
        driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(6) > td:nth-child(1)"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[2]/tbody/tr[6]/td[2]/input"));
        driver.findElement(By.partialLinkText("City"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[2]/tbody/tr[7]/td[2]/input"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[1]"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input"));
        driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(4) > tbody > tr:nth-child(9) > td:nth-child(1)"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[2]/tbody/tr[9]/td[2]/input"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[2]/tbody/tr[10]/td[1]"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[2]/tbody/tr[9]/td[2]/input"));
        driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(6) > tbody > tr:nth-child(1) > td:nth-child(1)"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[1]"));
        driver.findElement(By.cssSelector("#Catalog > form > table:nth-child(6) > tbody > tr:nth-child(2) > td:nth-child(2) > select"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[3]/td[1]"));
        driver.findElement(By.partialLinkText("#Catalog > form > table:nth-child(6) > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=checkbox]"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[4]/td[1]"));
        driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input"));
        driver.findElement(By.xpath("/html/body/div[2]/div/form/input"));
        driver.findElement(By.xpath("//*[@id=\"PoweredBy\"]/a"));

    }
}