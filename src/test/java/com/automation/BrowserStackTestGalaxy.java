package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTestGalaxy {

    public static final String USERNAME = "memetek1";
    public static final String AUTOMATE_KEY = "y6cTcnrc5B6je4Wp6cei";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void galaxyS10e() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("name", "memetek1's First Test");
        caps.setCapability("app","bs://f29ee48c34271ec17d141fe7acd8e376f5b56164");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL(URL),caps);

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


    }


}
