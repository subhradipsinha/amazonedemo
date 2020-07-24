package com;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class Appium_Main {
    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup(){

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("Platform Name","ANDROID");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");

            capabilities.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "");
            capabilities.setCapability(MobileCapabilityType.UDID, "");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            capabilities.setCapability(MobileCapabilityType.APP, "");
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            URL url = new URL("http://127.0.0.1:4723/wb/hub");
            driver = new AppiumDriver<MobileElement>(url,capabilities);
            driver = new AndroidDriver<MobileElement>(url,capabilities);
            driver = new IOSDriver<MobileElement>(url,capabilities);

        }catch (Exception e){
            System.out.println("Cause is :  "+e.getCause());
            System.out.println("Massage is :  " + e.getMessage());
            e.printStackTrace();
        }


    }
    @AfterTest
    public void teardown(){

    }
}
