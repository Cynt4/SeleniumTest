import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        //Znalezenie id elementu buttona o id clickOnMe
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //Znalezeienie elementu po name

//      By frameId = By.name("fname");
//      WebElement firstNameInput = driver.findElement(frameId);

        WebElement firstNameInput = driver.findElement(By.name("fname"));
        // Znalezeinie elementu po nazwie klasy
        WebElement paragraphHidden = driver.findElement(By.className("topSecret"));
        //Zwracamy jeden input
        WebElement input = driver.findElement(By.tagName("input"));
        //Zwracamy wiele inputów
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());
        //Wyszukiwanie za pomocą linku
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);
        By partialLinkText = By.partialLinkText(("Visit"));
        WebElement partialLink = driver.findElement(partialLinkText);

    }
}
