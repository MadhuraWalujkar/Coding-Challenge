import org.testng.annotations.Test;

import static common.constants.AlertConstants.SIGNUP_ALERT;
import static common.constants.LoginConstants.PASSWORD;
import static net.andreinc.mockneat.unit.user.Emails.emails;
import static org.testng.Assert.assertEquals;

public class SignupTest extends BaseTest {
    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testSignup() {
        screen().getNavigationBarScreen()
                .tapOnLoginIcon();
        screen().getLoginScreen()
                .tapOnSignUpContainer()
                .signUp(emails().domain("startup.io").val(), PASSWORD, PASSWORD);
        assertEquals(
                uiComponent().getAlertScreen().getAlertTitle(),
                SIGNUP_ALERT.getAlertTitle()
        );
        assertEquals(
                uiComponent().getAlertScreen().getAlertMessage(),
                SIGNUP_ALERT.getAlertMessage()
        );
    }
}
