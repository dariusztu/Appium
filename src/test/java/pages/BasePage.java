package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    public static WebDriverWait wait;
    //private static String url = "";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 2), this);
    }

    public WebElement getCalculatorOutput() {
        return calculatorOutput;
    }

    @FindBy(id = "com.android.calculator2:id/formula")
    private WebElement calculatorOutput;

    @FindBy(id = "com.android.calculator2:id/result")
    private WebElement calculatorResult;


    @FindBy(id = "com.android.calculator2:id/digit_0")
    private WebElement button0;

    @FindBy(id = "com.android.calculator2:id/digit_1")
    private WebElement button1;

    @FindBy(id = "com.android.calculator2:id/digit_2")
    private WebElement button2;

    @FindBy(id = "com.android.calculator2:id/digit_3")
    private WebElement button3;

    @FindBy(id = "com.android.calculator2:id/digit_4")
    private WebElement button4;

    @FindBy(id = "com.android.calculator2:id/digit_5")
    private WebElement button5;

    @FindBy(id = "com.android.calculator2:id/digit_6")
    private WebElement button6;

    @FindBy(id = "com.android.calculator2:id/digit_7")
    private WebElement button7;

    @FindBy(id = "com.android.calculator2:id/digit_8")
    private WebElement button8;

    @FindBy(id = "com.android.calculator2:id/digit_9")
    private WebElement button9;

    @FindBy(id = "com.android.calculator2:id/op_div")
    private WebElement divideButton;

    @FindBy(id = "com.android.calculator2:id/op_mul")
    private WebElement multiplyButton;

    @FindBy(id = "com.android.calculator2:id/op_add")
    private WebElement addButton;

    @FindBy(id = "com.android.calculator2:id/op_sub")
    private WebElement substractButton;

    @FindBy(id = "com.android.calculator2:id/eq")
    private WebElement equalsButton;

    @FindBy(id = "com.android.calculator2:id/del")
    private WebElement deleteButton;

    @FindBy(id = "com.android.calculator2:id/clr")
    private WebElement clearButton;



    public BasePage clickButton0() {
        button0.click();
        return this;
    }

    public BasePage clickButton1() {
        button1.click();
        return this;
    }

    public BasePage clickButton2() {
        button2.click();
        return this;
    }

    public BasePage clickButton3() {
        button3.click();
        return this;
    }

    public BasePage clickButton4() {
        button4.click();
        return this;
    }

    public BasePage clickButton5() {
        button5.click();
        return this;
    }

    public BasePage clickButton6() {
        button6.click();
        return this;
    }

    public BasePage clickButton7() {
        button7.click();
        return this;
    }

    public BasePage clickButton8() {
        button8.click();
        return this;
    }

    public BasePage clickButton9() {
        button9.click();
        return this;
    }

    public BasePage clickSubstractButton() {
        substractButton.click();
        return this;
    }

    public BasePage clickMultiplyButton() {
       multiplyButton.click();
        return this;
    }

    public BasePage clickAddButton() {
        addButton.click();
        return this;
    }

    public BasePage clickDivideButton() {
        divideButton.click();
        return this;
    }

    public BasePage clickEqualsButton() {
       equalsButton.click();
        return this;
    }

    public BasePage clickDeleteButton() {
       deleteButton.click();
        return this;
    }

    public BasePage clickClearButton() {
        clearButton.click();
        return this;
    }




    public String calculatorOutputReturnText() {
        String outputText = calculatorOutput.getText();
        return outputText;
    }

    public String calculatorResultReturnText() {
        String outputText = calculatorResult.getText();
        return outputText;
    }



}
