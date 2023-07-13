package common.constants;

import static util.PropertyFileReader.getPropertyValue;

public class LoginConstants {
    public static final String LOGIN_DATA_PROPERTY_FILE_PATH = "test_data/login_data.properties";

    public static final String PASSWORD = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "password");
    public static final String EMAIL_ADDRESS = getPropertyValue(LOGIN_DATA_PROPERTY_FILE_PATH, "email_address");

}
