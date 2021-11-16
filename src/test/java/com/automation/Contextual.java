package com.automation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Contextual {
    /*
From the main view, navigate through Views -> Expandable Lists -> Custom Adapte r
•Perform a long tap on People Names ro w
•Select Sample action in the Sample me nu
•The test success if: a Toast appears with some
 */
    @Test
    public void longPress() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\lenovo\\IdeaProjects\\AppiumAutomation\\ApiDemos-debug.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

        WebElement views = driver.findElementByAccessibilityId("Views");
        views.click();



        Thread.sleep(5000);
        WebElement expandableList = driver.findElementByAccessibilityId("Expandable Lists");
        expandableList.click();

        Thread.sleep(5000);
        WebElement customAdaptor = driver.findElementByAccessibilityId("1. Custom Adapter");
        customAdaptor.click();


        Thread.sleep(5000);
        WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(peopleNames)).withDuration(Duration.ofSeconds(3))).perform();

        Thread.sleep(5000);
        WebElement sampleAction = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']"));
        sampleAction.click();
        Thread.sleep(3000);
    }
}