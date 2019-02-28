package scenarios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {

    public AppiumDriver<MobileElement> driver;

    private BasePage basepage;

    public WebDriverWait wait;

    @BeforeClass


        public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Galaxy Nexus 5");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.android.calculcator2.Calculator");
        caps.setCapability("appActivity","com.android.calculcator2.Calculator");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);

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

        public void basicTest () throws InterruptedException {
            //Click and pass Splash
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.id("com.android.calculator2.Calculator.app:id/animation_view"))).click();

            //Click and pass Tutorial
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.id("com.isinolsun.app:id/btn_skip"))).click();

            //Click to "Is Ariyorum" Button
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();


            //Notification Allow
            if (driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).size()>0) {
                driver.findElements(By.id("com.android.packageinstaller:id/permission_allow_button")).get(0).click();
            }

            //Click second job
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath(secondNewJob))).click();

        }

    }

}
