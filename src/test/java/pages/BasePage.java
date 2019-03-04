package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    //private static String url = "";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.android.calculator2:id/formula")
    private WebElement calculatorOutput;


    public BasePage click(WebElement element) {
        element.click();
        return this;
    }

    public String getTextToString(WebElement element) {
        String elementText = element.getText();
        return elementText;

    }

    public String calculatorOutputReturnText() {
        String outputText = calculatorOutput.getText();
        return outputText;
    }

    public BasePage sendKeysFromString(WebElement element, String keys) {
        element.sendKeys(keys);
        return this;
    }

}
