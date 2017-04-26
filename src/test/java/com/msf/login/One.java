package com.msf.login;

import org.openqa.selenium.Platform;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Vidhya on 4/24/17.
 */
public class One extends ObjectRepo{


       @Test
        public void first() throws IOException, InterruptedException {


           //System.setProperty("webdriver.gecko.driver", "/Users/krishnaraj/Downloads/geckodriver");

          // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
           //capabilities.setCapability("marionette", true);
           // DesiredCapabilities caps =  new DesiredCapabilities();
         //  caps.setBrowserName("Chrome");
         //  caps.setPlatform(Platform.MAC);
           // caps.setVersion("45.0");

           WebDriver dr ;
           DesiredCapabilities caps = DesiredCapabilities.chrome();
           caps.setPlatform(Platform.WIN10);
           caps.setBrowserName("Chrome");
           caps.setVersion("43.0");

           dr = new RemoteWebDriver(new URL("http://tomnjerry:43bcf6e7-7fcb-4193-9756-582bd5db7653@ondemand.saucelabs.com:80/wd/hub"), caps);
           dr.get("https://www.google.com/");
           Thread.sleep(5000);
         


        }

}
