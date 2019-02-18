package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.BasePage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    private BasePage basepage;

    public AndroidDriver driver;

    @BeforeClass
    public static void steup() {

    }

    @Before
    public void setupDriver() {
        driver = new AndroidDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void returnTrueIfVisible() {

    }

}
