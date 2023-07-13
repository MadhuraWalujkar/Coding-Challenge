package screens;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends BaseScreen {
    private final By signUpContainer = MobileBy.AccessibilityId("button-sign-up-container");
    private final By passwordTextBox = MobileBy.AccessibilityId("input-password");
    private final By emailAddressTextBox = MobileBy.AccessibilityId("input-email");
    private final By confirmPasswordTextBox = MobileBy.AccessibilityId("input-repeat-password");
    private final By loginButton = MobileBy.AccessibilityId("button-LOGIN");
    private final By signupButton = MobileBy.AccessibilityId("button-SIGN UP");
    

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    public LoginScreen tapOnSignUpContainer() {
        tap(signUpContainer);
        return this;
    }

    public void signUp(String emailAddress, String password, String confirmPassword) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        inputConfirmPassword(confirmPassword);
        tapOnSignUpButton();
    }
    
    public void login(String emailAddress, String password) {
        inputEmailAddress(emailAddress);
        inputPassword(password);
        tapOnLoginButton();
    }

    private void inputEmailAddress(String emailAddress) {
        inputText(emailAddressTextBox, emailAddress);
    }

    private void inputPassword(String password) {
        inputText(passwordTextBox, password);
    }

    private void inputConfirmPassword(String confirmPassword) {
        inputText(confirmPasswordTextBox, confirmPassword);
    }

    private void tapOnSignUpButton() {
        tap(signupButton);
    }
    private void tapOnLoginButton() {
        tap(loginButton);
    }
}
