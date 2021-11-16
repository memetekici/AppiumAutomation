package com.automation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Iphone {

    public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
    public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void iphone11Pro() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 11 Pro");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "13");
        caps.setCapability("name", "iphone 11 pro Test");
        caps.setCapability("app","bs://f29ee48c34271ec17d141fe7acd8e376f5b56164");

        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL(URL),caps);

        Thread.sleep(3000);
    }


}
