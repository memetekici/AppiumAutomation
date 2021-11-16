package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    @Test
    public void calculator() throws MalformedURLException, InterruptedException {


        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "11.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(5000);

        WebElement digit9 = driver.findElementById("com.android.calculator2:id/digit_9");
        WebElement digit5 = driver.findElementById("com.android.calculator2:id/digit_5");
        WebElement digit2 = driver.findElementById("com.android.calculator2:id/digit_2");
        WebElement digit8 = driver.findElementById("com.android.calculator2:id/digit_8");
        WebElement digit1 = driver.findElementById("com.android.calculator2:id/digit_1");
        WebElement digit7 = driver.findElementById("com.android.calculator2:id/digit_7");
        WebElement digit3 = driver.findElementById("com.android.calculator2:id/digit_3");
        WebElement digit4 = driver.findElementById("com.android.calculator2:id/digit_4");
        WebElement digit6 = driver.findElementById("com.android.calculator2:id/digit_6");
        WebElement plus = driver.findElementByAccessibilityId("plus");
        WebElement multiply = driver.findElementByAccessibilityId("multiply");
        WebElement divide = driver.findElementByAccessibilityId("divide");
        WebElement minus = driver.findElementByAccessibilityId("minus");
        WebElement equal = driver.findElementByAccessibilityId("equals");
        WebElement result = driver.findElementById("com.android.calculator2:id/result");
//        digit9.click();
//        digit5.click();
//
//        plus.click();
//
//        digit2.click();
//        digit8.click();
//
//        equal.click();
//
//        Thread.sleep(3000);
//
//        String expected = "123";
//
//        Assert.assertEquals(expected,result.getText());
        digit1.click();
        digit4.click();
        digit3.click();

        multiply.click();

        digit8.click();
        digit1.click();

        equal.click();
        System.out.println(result.getText());
    }
}