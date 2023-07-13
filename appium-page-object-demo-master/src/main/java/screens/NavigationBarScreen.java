package screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarScreen extends BaseScreen {
    private final By loginIcon = MobileBy.AccessibilityId("Login");

    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnLoginIcon() {
        tap(loginIcon);
    }
}
