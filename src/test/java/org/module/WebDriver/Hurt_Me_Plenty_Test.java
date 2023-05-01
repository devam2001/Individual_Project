package org.module.WebDriver;

import com.module.WebDriver.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


public class Hurt_Me_Plenty_Test extends TestBase{

    WebDriver driver;
    Hurt_Me_Plenty hurtMePlenty;

    @Test(priority = 1)
    public void checkInfoProvisionModel() throws InterruptedException {


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

        String vmClass=hurtMePlenty.getVmClassData().getText();
        Assert.assertEquals(vmClass,"Provisioning model: Regular");
    }
    @Test(priority = 2)
    public void checkRegion()throws InterruptedException{

            String region = hurtMePlenty.getLocation().getText();
            Assert.assertEquals(region,"Region: Frankfurt");
    }
    @Test(priority = 3)
    public void checkSSD() throws InterruptedException{

        String ssd = hurtMePlenty.getSsdData().getText();
        Assert.assertEquals(ssd, "Local SSD: 2x375 GiB\n" +
                "Committed Use Discount applied");
    }
    @Test(priority = 4)
    public void checkInstanceType()throws InterruptedException {

        String instance = hurtMePlenty.getInstanceType().getText();
        Assert.assertEquals(instance, "Instance type: n1-standard-8\n"+
                "Committed Use Discount applied");
    }
    @Test(priority = 5)
    public void checkCommitment()throws InterruptedException {

        String time = hurtMePlenty.getCommitment().getText();
        Assert.assertEquals(time, "Commitment term: 1 Year");
    }
    @Test(priority = 6)
    public void checkCost()throws InterruptedException {
        String cost = hurtMePlenty.getCost().getText();
        Assert.assertEquals(cost, "Total Estimated Cost: USD 1,081.20 per 1 month");
    }

}