package scenarios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import static org.assertj.core.api.Assertions.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    private BasePage basepage;
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass


        public static void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy Nexus 5");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);

    }

    @Before
    public void setupDriver() {

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test


        public void checkIfChosenNumberAndDisplayedNumberAreEqual() throws InterruptedException {
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.id("com.android.calculator2:id/digit_7"))).click();
            String outputText1 = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
            System.out.println(outputText1);
                    assertThat(outputText1).isEqualTo("7");



        }

    }


