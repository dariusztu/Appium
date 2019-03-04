package pages.System;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class SystemPage extends BasePage {

    AndroidDriver driver;

    public SystemPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    String app_package_name = "com.flipkart.android:id/";

   /* @FindBy(id = app_package_name + "user_id");
    private WebElement userId; */


}
