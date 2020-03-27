import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
/*
* Purpose : Program to automate Myntra mobile application using appium.
*           Searching product, applying filters, choosing product, size selection, adding it to cart, removing product from cart
*
* Author : Sahil Kudake
*
* */
public class Myntra {
    public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "RZ8M31KBR8W");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.myntra.android");
        dc.setCapability("appActivity", "SplashActivity");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("search");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("search_default_search_text_input");
        el2.sendKeys("casual t shirt");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(2000);
        MobileElement e31 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='FILTER']");
        e31.click();
        MobileElement e32 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='m']");
        e32.click();
        MobileElement e33 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='Brand']");
        e33.click();
        Thread.sleep(1000);
        MobileElement e34 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='ADIDAS']");
        e34.click();
        Thread.sleep(1000);
        MobileElement e35 = (MobileElement) driver.findElementByClassName("android.widget.EditText");
        e35.sendKeys("WROGN");
        Thread.sleep(2000);
        MobileElement e36 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='WROGN']");
        e36.click();
        Thread.sleep(1000);
        MobileElement e37 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='APPLY']");
        e37.click();
        Thread.sleep(2000);
        MobileElement el8 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[2]");
        el8.click();
        MobileElement e19 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.TextView'][@text='ADD TO BAG']");
        e19.click();
        MobileElement e20 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc='size_select_1']");
        e20.click();
        MobileElement el10 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc='buy_done_button']");
        el10.click();
        Thread.sleep(2000);
        MobileElement el11 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc='buy_button']");
        el11.click();
        Thread.sleep(2000);
        MobileElement el13 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.Button'][@text='REMOVE']");
        el13.click();
    }
}
