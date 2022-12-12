import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectCheck {
    public boolean SelectChecker(String selectChecker, WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(selectChecker)) {
                return true;
            }
        }
        return false;
    }


}
