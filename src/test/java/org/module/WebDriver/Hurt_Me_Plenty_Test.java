package org.module.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Hurt_Me_Plenty_Test extends TestBase{

    @Test(priority = 1)
    public void google_cloud_price_calc() throws InterruptedException {

        Hurt_Me_Plenty.openGcpPage(url);
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

        String region = hurtMePlenty.getLocation().getText();
        Assert.assertEquals(region,"Region: Frankfurt");

        String ssd = hurtMePlenty.getSsdData().getText();
        Assert.assertEquals(ssd, "Local SSD: 2x375 GiB\n" +
                "Committed Use Discount applied");

        String instance = hurtMePlenty.getInstanceType().getText();
        Assert.assertEquals(instance, "Instance type: n1-standard-8\n"+
                "Committed Use Discount applied");

        String time = hurtMePlenty.getCommitment().getText();
        Assert.assertEquals(time, "Commitment term: 1 Year");

        String cost = hurtMePlenty.getCost().getText();
        Assert.assertEquals(cost, "Total Estimated Cost: USD 1,081.20 per 1 month");

    }

}