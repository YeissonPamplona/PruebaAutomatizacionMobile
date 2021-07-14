package com.sistecredito.pruebadafiti.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver(){}

    public static WebDriver mobile(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("appPackage", "br.com.dafiti");
        capabilities.setCapability("appActivity", "br.com.dafiti.activity.SplashSelectCountry_");
        capabilities.setCapability("unicodeKeyboard", "false");
        capabilities.setCapability("resetKeyboard", "false");

        try {
            return new io.appium.java_client.AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }
}
