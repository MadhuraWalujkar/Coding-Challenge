package util.driver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public interface MobileDriverService {
    void spinUpDriver();

    void closeDriver();

    MobileDriver<MobileElement> getDriver();
}
