import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage() {
        getDriver("Edge");
    }

    public WebDriver getDriver(String browser) {
        return switch (browser) {
            case "Chrome" -> new ChromeDriver();
            case "Firefox" -> new FirefoxDriver();
            case "Edge" -> new EdgeDriver();
            default -> throw new InvalidArgumentException("Invalid name");
        };
    }

}
