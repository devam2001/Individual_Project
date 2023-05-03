package org.module.WebDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class I_Can_Win_Test extends TestBase{

    @Test
    public void pastefunc() throws InterruptedException{

        I_Can_Win.openBinPage();
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