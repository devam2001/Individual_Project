package org.module.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class I_Can_Win {
    private static WebDriver driver;
    By testArea = By.xpath("//div[contains(@class,'required')]/textarea[contains(@class,'textarea')]");
    By bdy = By.xpath("//body");
    By pasteExp = By.xpath("//span[contains(text(),'Never')]");
    By selPasteExp = By.xpath("//li[text() = '10 Minutes']");
    By pasteName = By.cssSelector("#postform-name");
    By bdy2 = By.xpath("//label[contains(text(),'Paste Name / Title:')]");
    public I_Can_Win(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public static void openBinPage(){
        driver.get("https://pastebin.com/");
    }
    public void clickTextArea(){
        driver.findElement(testArea).click();
    }
    public void clickAddTextArea(String txt){
        driver.findElement(testArea).sendKeys(txt);
    }
    public void clickSelPasteExp() throws InterruptedException {
        driver.findElement(bdy).click();
        TimeUnit.SECONDS.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(pasteExp).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(selPasteExp).click();
    }
    public void clickPastTitle() throws InterruptedException {

        driver.findElement(bdy2).click();
        driver.findElement(pasteName).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(pasteName).sendKeys("helloweb");
    }

}