import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionsTest {
//    @Test
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
        System.out.println(usernameInput.getAttribute("value"));
//        usernameInput.sendKeys(Keys.ENTER);
        usernameInput.sendKeys(Keys.TAB);
        Alert firstAlert = driver.switchTo().alert();
//        firstAlert.accept();
//        driver.switchTo().alert().accept();

//        driver.findElement(By.cssSelector("[type='checkbox')")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByValue("saab");

        List<WebElement> options = cars.getOptions();
        for (WebElement element : options) {
            System.out.println(element.getText());
        }

        WebElement para = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println(para.getText());
        System.out.println(para.getAttribute("value"));
        System.out.println(para.getAttribute("text-content"));



    }
}
