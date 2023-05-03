package org.module.WebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(TestListner.class)
public class TestBase {
    WebDriver driver;
    Hurt_Me_Plenty hurtMePlenty;
    I_Can_Win iCanWin;
    String url;

    @BeforeMethod
    @Parameters({"browser"})
    public void setDriver(String br) throws IOException {

        PropertiesOperation p = new PropertiesOperation();
        String chrome = p.getPropertyFileData("browser1");
        String edge = p.getPropertyFileData("browser2");

        url=p.getPropertyFileData("GCPlink");

        if (chrome.equals("chrome") && br.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(edge.equals("edge") && br.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        iCanWin = new I_Can_Win(driver);
        hurtMePlenty = new Hurt_Me_Plenty(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        driver.quit();
    }

}