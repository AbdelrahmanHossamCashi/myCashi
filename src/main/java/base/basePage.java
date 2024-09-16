package base;

import io.appium.java_client.android.AndroidDriver;

public class basePage {
    protected static AndroidDriver driver;

    public basePage(AndroidDriver driver)
    {
        this.driver = driver;
    }
}
