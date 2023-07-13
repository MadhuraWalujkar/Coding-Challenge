package common;

import org.openqa.selenium.WebDriver;
import screens.BaseScreen;
import screens.uicomponents.AlertScreen;

public class UiComponentProvider extends BaseScreen {
    public UiComponentProvider(WebDriver driver) {
        super(driver);
    }

    public AlertScreen getAlertScreen() {
        return new AlertScreen(driver);
    }
}
