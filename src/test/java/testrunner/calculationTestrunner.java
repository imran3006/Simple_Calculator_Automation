package testrunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculationScreen;

import java.io.IOException;

public class calculationTestrunner extends Setup{
    @Test(priority = 0)
    public void doSum() throws IOException,InterruptedException {
        CalculationScreen calculationScreen = new CalculationScreen(driver);
        String res=calculationScreen.doSum();
        Assert.assertEquals(res, "12");

    }
    @Test(priority = 1)
    public void doSub() throws IOException,InterruptedException {
        CalculationScreen calculationScreen = new CalculationScreen(driver);
        String res=calculationScreen.doSub();
        Assert.assertEquals(res, "4");

    }
    @Test(priority = 2)
    public void doMul() throws IOException,InterruptedException {
        CalculationScreen calculationScreen = new CalculationScreen(driver);
        String res=calculationScreen.doMul();
        Assert.assertEquals(res, "32");

    }
    @Test(priority = 3)
    public void doDiv() throws IOException,InterruptedException {
        CalculationScreen calculationScreen = new CalculationScreen(driver);
        String res=calculationScreen.doDiv();
        Assert.assertEquals(res, "2");

    }


}
