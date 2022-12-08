import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelectorsTest {
    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag);

        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By all = By.cssSelector("*");
        driver.findElement(all);

        By ulInsideDiv = By.cssSelector("div ul");
        driver.findElement(ulInsideDiv);

        By firstUlInsideDiv = By.cssSelector("div > ul");
        driver.findElement(firstUlInsideDiv);

        By firstFormAfterLabel = By.cssSelector("label + form");
        driver.findElement(firstFormAfterLabel);

        By allFormsAfterLabel = By.cssSelector("label ~ form");
        driver.findElement(allFormsAfterLabel);

        By attrTag = By.cssSelector("input[name='fname']");
        driver.findElement(attrTag);

        By attrContains = By.cssSelector("[name*='name']");
        driver.findElement(attrContains);

        By attrStarts = By.cssSelector("[name^='f']");
        driver.findElement(attrStarts);

        By attrEnds = By.cssSelector("[name$='name']");
        driver.findElement(attrEnds);

        By firstChild = By.cssSelector("li:first-child");
        driver.findElement(firstChild);

        By lastChild = By.cssSelector("li:last-child");
        driver.findElement(lastChild);

        By nthChild = By.cssSelector("li:nth-child(3)");
        driver.findElement(nthChild);
    }
}
