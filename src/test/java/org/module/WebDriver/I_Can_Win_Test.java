package org.module.WebDriver;

import com.module.WebDriver.browser.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class I_Can_Win_Test {

    WebDriver driver;
    I_Can_Win iCanWin;
    @Test
    public void loginVerification() throws InterruptedException {
        driver = BrowserFactory.setupBrowser("chrome","https://pastebin.com/");
        iCanWin = new I_Can_Win(driver);

        TimeUnit.SECONDS.sleep(2);
        iCanWin.clickTextArea();
        TimeUnit.SECONDS.sleep(3);
        iCanWin.clickAddTextArea("Hello from WebDriver");
        TimeUnit.SECONDS.sleep(3);
        iCanWin.clickSelPasteExp();
        TimeUnit.SECONDS.sleep(2);
        iCanWin.clickPastTitle();
        TimeUnit.SECONDS.sleep(2);
        driver.quit();
    }

}