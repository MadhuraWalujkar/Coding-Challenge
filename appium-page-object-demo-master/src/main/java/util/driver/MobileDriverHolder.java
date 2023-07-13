package util.driver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class MobileDriverHolder {
    private static final ThreadLocal<MobileDriver<MobileElement>> driver = new ThreadLocal<>();

    public static MobileDriver<MobileElement> getDriver() {
        return driver.get();
    }

    public static void setDriver(MobileDriver<MobileElement> driver) {
        MobileDriverHolder.driver.set(driver);
    }
}
