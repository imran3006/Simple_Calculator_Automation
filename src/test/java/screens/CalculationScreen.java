package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static base.Setup.PACKAGE_ID;

public class CalculationScreen {
    @FindBy(id = PACKAGE_ID+":id/digit_4")
    AndroidElement digit_4;
    @FindBy(id = PACKAGE_ID+":id/digit_8")
    AndroidElement digit_8;
    @FindBy(id = PACKAGE_ID+":id/op_add")
    AndroidElement buttonAdd;
    @FindBy(id = PACKAGE_ID+":id/op_sub")
    AndroidElement buttonSub;
    @FindBy(id = PACKAGE_ID+":id/op_mul")
    AndroidElement buttonMul;
    @FindBy(id = PACKAGE_ID+":id/op_div")
    AndroidElement buttonDiv;
    @FindBy(id = PACKAGE_ID+":id/eq")
    AndroidElement buttonEql;
    @FindBy(id = PACKAGE_ID+":id/result_final")
    AndroidElement lblReslt;
    @FindBy(id = PACKAGE_ID+":id/clr")
    AndroidElement buttonClr;


    ///page object factory creation

    public CalculationScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public String doSum() throws InterruptedException, IOException {

        digit_4.click();
        buttonAdd.click();
        digit_8.click();
        buttonEql.click();
        Thread.sleep(1000);
        return lblReslt.getText();

    }
    public String doSub() throws InterruptedException {
        buttonClr.click();
        digit_8.click();
        buttonSub.click();
        digit_4.click();
        buttonEql.click();
        Thread.sleep(1000);
        return lblReslt.getText();
    }
    public String doMul() throws InterruptedException {
        buttonClr.click();
        digit_8.click();
        buttonMul.click();
        digit_4.click();
        buttonEql.click();
        Thread.sleep(1000);
        return lblReslt.getText();

    }
    public String doDiv() throws InterruptedException {
        buttonClr.click();
        digit_8.click();
        buttonDiv.click();
        digit_4.click();
        buttonEql.click();
        Thread.sleep(1000);
        buttonClr.click();
        return lblReslt.getText();
    }



}
