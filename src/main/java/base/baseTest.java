package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {
    public AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
//cmd commands
//        1-Mycurrent app command : adb shell dumpsys window | find "mCurrentFocus"
//        2-device name : adb devices

        DesiredCapabilities dC = new DesiredCapabilities() ;
        dC.setCapability("deviceName","emulator-5554");
        dC.setCapability("platformName","android");
//        dC.setCapability("appPackage","");
//        dC.setCapability("appActivity","");
        dC.setCapability("app","");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),dC);


    }
}
