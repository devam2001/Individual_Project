package org.module.WebDriver;

import com.module.WebDriver.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class Hurt_Me_Plenty_Test {

    WebDriver driver;
    Hurt_Me_Plenty hurtMePlenty;

    @Test
    public void loginVerification() throws InterruptedException {

        ResourceBundle bundle = ResourceBundle.getBundle("config");
        String chrome = bundle.getString("browser1");
        String edge = bundle.getString("browser2");
        String link = bundle.getString("GCPlink");


        driver = BrowserFactory.setupBrowser(chrome,link);

        hurtMePlenty = new Hurt_Me_Plenty(driver);

        TimeUnit.SECONDS.sleep(2);
        hurtMePlenty.clickSearch();
        TimeUnit.SECONDS.sleep(2);
        hurtMePlenty.enterTxt();
        TimeUnit.SECONDS.sleep(7);
        hurtMePlenty.selGCPC();
        TimeUnit.SECONDS.sleep(2);
        hurtMePlenty.switchToiFrame();
        TimeUnit.SECONDS.sleep(2);
        hurtMePlenty.selCompEng();
        TimeUnit.SECONDS.sleep(2);
        hurtMePlenty.compEnginFrm();
        TimeUnit.SECONDS.sleep(2);

        String region = hurtMePlenty.getLocation().getText();
        Assert.assertEquals(region,"Region: Frankfurt");

        String vmClass=hurtMePlenty.getVmClassData().getText();
        Assert.assertEquals(vmClass,"Provisioning model: Regular");

//        String instance = hurtMePlenty.getInstanceType().getText();
//        Assert.assertEquals(instance, "Instance type: n1-standard-8\n"+
//                "Committed Use Discount applied");
//
//        String ssd = hurtMePlenty.getSsdData().getText();
//        Assert.assertEquals(ssd, "Local SSD: 2x375 GiB\n" +
//                "Committed Use Discount applied");
//
//        String time = hurtMePlenty.getCommitment().getText();
//        Assert.assertEquals(time, "Commitment term: 1 Year");
//
//        String cost = hurtMePlenty.getCost().getText();
//        Assert.assertEquals(cost, "Total Estimated Cost: USD 1,081.20 per 1 month");

        driver.quit();
    }

}