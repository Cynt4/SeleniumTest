import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.image.Kernel;

public class SeleniumTest {

    @Test
    public void openGooglePage() {
        WebDriver driver = getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // Przechodzimy do okienka z plikami cookie
//        driver.switchTo().frame(0);
        // Znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()= 'Zaakceptuj wszystko']"));
        //Kliknięcie w przycisk (akceptacja plików cookie)
        agreeButton.click();
        //Powrót do pierwotnego okna
        driver.switchTo().defaultContent();
        // Znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        //Wprowadz w pole wyszukiwania fraze Selenium
        searchField.sendKeys("Selenium");
        //Zasymuluj kliknięcie przycisku enter
        searchField.sendKeys(Keys.ENTER);
        //Znalezienie rezultatu
        WebElement result = driver.findElement(By.xpath("//a[contains(@href, 'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
    }

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "Chrome":
                String chromePath = "C:\\Users\\Jacek\\Downloads\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromePath);
                return new ChromeDriver();
            case "Firefox":
                String firefoxPath = "\"C:\\Users\\Jacek\\Downloads\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", firefoxPath);
                return new FirefoxDriver();
            case "Edge":
                String edgePath = "C:\\Users\\Jacek\\Downloads\\edgedriver_win64\\msedgedriver.exe";
                System.setProperty("webdriver.edge.driver", edgePath);
                return new EdgeDriver();
            default:
                throw new InvalidArgumentException("Invalid name");
        }
    }

}
