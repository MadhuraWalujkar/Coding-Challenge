import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static common.constants.AlertConstants.LOGIN_ALERT;
import static common.constants.LoginConstants.PASSWORD;
import static common.constants.LoginConstants.EMAIL_ADDRESS;



public class LoginTest extends BaseTest {
    @Test(description = "Verify if a user is able to login to the application with valid credentials")
    public void testValidLogin() {
        screen().getNavigationBarScreen()
                .tapOnLoginIcon();
        screen().getLoginScreen()
                .login(EMAIL_ADDRESS, PASSWORD);
        assertEquals(
                uiComponent().getAlertScreen().getAlertTitle(),
                LOGIN_ALERT.getAlertTitle()
        );
        assertEquals(
                uiComponent().getAlertScreen().getAlertMessage(),
                LOGIN_ALERT.getAlertMessage()
        );
    }
}
