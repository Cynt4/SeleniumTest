import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicActionsTest {
    @Test
    public void performAction() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        basicLink.click();
        WebElement usernameInput = driver.findElement(By.name("username"));
        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.name("fname")).sendKeys("Jacek");
        usernameInput.clear();
        usernameInput.sendKeys("Jacek");
    }
}
