package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealMobileTesting {

    @Test
    public void real() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","6.0.1");
        caps.setCapability("deviceName","SM-J700F");
        caps.setCapability("udid","");
        caps.setCapability("appPackage","com.sec.android.app.popupcalculator");
        caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        WebElement digit1 = driver.findElement(By.xpath("//*[@index='12']"));
        WebElement digit2 = driver.findElement(By.xpath("//*[@index='13']"));
        WebElement digit3 = driver.findElement(By.xpath("//*[@index='14']"));
        WebElement digit8 = driver.findElement(By.xpath("//*[@index='5']"));
        WebElement digit9 = driver.findElement(By.xpath("//*[@index='6']"));
        WebElement multiple = driver.findElement(By.xpath("//*[@index='7']"));
        WebElement equals = driver.findElement(By.xpath("//*[@index='19']"));
        WebElement result = driver.findElement(By.xpath("//*[@index='0']"));
        digit1.click();
        digit2.click();
        digit3.click();
        multiple.click();
        digit8.click();
        digit9.click();
        equals.click();
        Thread.sleep(3000);
        System.out.println(result.getText());

    }
}
