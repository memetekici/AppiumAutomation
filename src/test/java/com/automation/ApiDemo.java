package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemo {
     /*
  From the main view, navigate through Preferences -> Preference dependencies
 •Turn ON WiFi option. Select WiFi Settings and write any text and click OK to close the dialog
*/

    @Test
    public void apiDemo() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","11.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\lenovo\\IdeaProjects\\AppiumAutomation\\etsy.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);

        WebElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();

        Thread.sleep(5000);
        WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
        preferenceDependencies.click();

        Thread.sleep(5000);
        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();

        Thread.sleep(5000);
        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();

        Thread.sleep(5000);
        WebElement inputBox = driver.findElementById("android:id/edit");
        inputBox.sendKeys("appiumTest");

        Thread.sleep(5000);
        WebElement okButton = driver.findElementById("android:id/button1");
        Thread.sleep(5000);
        okButton.click();

        Thread.sleep(5000);
        wifiSetting.click();

        Assert.assertEquals("appiumTest",inputBox.getText());
        driver.closeApp();

    }
}
