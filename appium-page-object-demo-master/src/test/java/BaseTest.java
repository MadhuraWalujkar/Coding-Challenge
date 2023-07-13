import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import common.ScreenProvider;
import common.UiComponentProvider;
import util.driver.MobileDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.getDriver;
import util.driver.MobileDriverFactory;
import util.driver.MobileDriverHolder;



import static java.util.concurrent.TimeUnit.SECONDS;

import static com.maxsoft.testngtestresultsanalyzer.DriverHolder.setDriver;


@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {
	private final MobileDriverService driverService = driverFactory.getDriverService();
	private final MobileDriverFactory driverFactory = new MobileDriverFactory();
    

    @BeforeMethod
    public void setUp() {
        driverService.spinUpDriver();
        MobileDriverHolder.setDriver(driverService.getDriver());
        setDriver(MobileDriverHolder.getDriver());
        MobileDriverHolder.getDriver().manage().timeouts().implicitlyWait(30, SECONDS);
    }

    public ScreenProvider screen() {
        return new ScreenProvider(getDriver());
    }

    public UiComponentProvider uiComponent() {
        return new UiComponentProvider(getDriver());
    }

    @AfterMethod
    public void tearDown() {
        driverService.closeDriver();
    }
}
