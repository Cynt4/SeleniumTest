import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverManagerTest {
    @Test
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();
        WebDriver edgeDriver = new EdgeDriver();
        chromeDriver.manage().window().maximize();
        Dimension windowsSize = new Dimension(200, 200);
        chromeDriver.manage().window().setSize(windowsSize);
        edgeDriver.get("https://www.google.com");
        chromeDriver.quit();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('Hello')");

        driver.get("https://www.google.com");

        firefoxDriver.quit();
        edgeDriver.close();
    }
}
