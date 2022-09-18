package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public AndroidDriver driver; //iniatialized driver
    //using package id variable and assign a const value. and for that here
    // using final keyword before variable name.
    public static final String PACKAGE_ID="com.google.android.calculator";
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "My Device");
        cap.setCapability("platformName", "Android");
//        cap.setCapability("uuid", "");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("autoGrantPermissions", true);
        //loopback address and port num
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        //after 30s it will show timeout error
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver; // driver is loaded here. for using this in other pages , we should return it


    }

}
