package util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyFileReader {
    public static String getPropertyValue(String filename, String propertyName) {
        String propertyValue = null;

        try (InputStream input = Files.newInputStream(Paths.get("./src/test/resources/" + filename))) {
            Properties prop = new Properties();
            prop.load(input);
            propertyValue = prop.getProperty(propertyName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return propertyValue;
    }
}
