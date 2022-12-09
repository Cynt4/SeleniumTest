import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.findElement(By.id("fname")).sendKeys("Jacek");
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("Jacek");
//        usernameInput.sendKeys(Keys.ENTER);
        usernameInput.sendKeys(Keys.TAB);

//        driver.findElement(By.cssSelector("[type='checkbox')")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();

    }
}
