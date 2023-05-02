package com.module.WebDriver.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ResourceBundle;

public class BrowserFactory {
    static WebDriver driver;



    public static WebDriver setupBrowser(String browser, String url){
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        String chrome = bundle.getString("browser1");
        String edge = bundle.getString("browser2");

        if (browser.equalsIgnoreCase(chrome)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase(edge)){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

}
