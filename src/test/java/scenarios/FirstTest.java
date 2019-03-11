package scenarios;


import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.BasePage;

import static org.assertj.core.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    private BasePage basepageObject;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy Nexus 5");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);


    }

    @Before
    public void setupDriver() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test


    public void checkIfFiveMultiplyBy60Equals300() {

        basepageObject = new BasePage(driver);
        basepageObject.clickButton5()
                .clickMultiplyButton()
                .clickButton6()
                .clickButton0()
                .clickEqualsButton();
        assertThat(basepageObject.calculatorResultReturnText()).isEqualTo("300");

    }

}


