package org.module.WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class I_Can_Win {
    private WebDriver driver;

    @FindBy(xpath = "//div[contains(@class,'required')]/textarea[contains(@class,'textarea')]")
    private WebElement textArea;

    @FindBy(xpath = "//body")
    private WebElement bdy;

    @FindBy(xpath = "//span[contains(text(),'Never')]")
    private WebElement pasteExp;

    @FindBy(xpath = "//li[text() = '10 Minutes']")
    private WebElement selPasteExp;

    @FindBy(css = "#postform-name")
    private WebElement pasteName;

    @FindBy(xpath = "//label[contains(text(),'Paste Name / Title:')]")
    private WebElement bdy2;

    public I_Can_Win(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickTextArea(){
        textArea.click();
    }
    public void clickAddTextArea(String txt){
        textArea.sendKeys(txt);
    }
    public void clickSelPasteExp() throws InterruptedException {
        bdy.click();
        TimeUnit.SECONDS.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        TimeUnit.SECONDS.sleep(2);
        pasteExp.click();
        TimeUnit.SECONDS.sleep(2);
        selPasteExp.click();
    }
    public void clickPastTitle() throws InterruptedException {

        bdy2.click();
        pasteName.click();
        TimeUnit.SECONDS.sleep(2);
        pasteName.sendKeys("helloweb");
    }

}