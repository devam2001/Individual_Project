package org.module.WebDriver;

import com.module.WebDriver.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import java.util.ResourceBundle;

public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    public void setup() {

        ResourceBundle bundle = ResourceBundle.getBundle("config");
        String chrome = bundle.getString("browser1");
        String edge = bundle.getString("browser2");
        String link = bundle.getString("GCPlink");

        driver = BrowserFactory.setupBrowser(chrome,link);
        driver = BrowserFactory.setupBrowser(edge,link);

    }

}