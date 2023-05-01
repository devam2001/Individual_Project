package org.module.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class Hurt_Me_Plenty {
    private WebDriver driver;

    @FindBy(xpath = "//form[contains(@class,'search-form')]")
    private WebElement searchBttn;
    @FindBy(xpath = "//input[@placeholder = 'Search']")
    private WebElement EnterTxt;
    @FindBy(xpath = "//div[@class = 'gs-title']/a[@class = 'gs-title']/b[contains(text(), 'Google Cloud Pricing Calculator')]")
    private WebElement selGCP;
    @FindBy(xpath = "//iframe[contains(@name,'goog_')]")
    private WebElement switchFrame;
    @FindBy(xpath = "//md-tab-item[@tabindex = 0]/div[@title = \"Compute Engine\"]/div[contains(@class,'presets-buttons')]/div[@class = \"name\"]/span[text() = 'Compute Engine']")
    private WebElement compEgin;
    @FindBy(xpath = "/html[1]/body[1]/md-content[1]/md-card[1]/div[1]/md-card-content[1]/div[2]/div[1]/md-card[1]/md-card-content[1]/div[1]/div[1]/form[1]/div[1]/div[1]/md-input-container[1]/input[1]")
    private WebElement numOfInstances;
    @FindBy(xpath = "//*[@id=\"input_97\"]")
    private WebElement whtInstancesFor;
    @FindBy(xpath="//md-select[@name='series']/parent::md-input-container")
    private WebElement series;
    @FindBy(xpath="//div[contains(text(), \"N1\")]")
    private WebElement seriesType;
    @FindBy(xpath = "//label[text()='Machine type']/parent::md-input-container")
    private WebElement machineTyp;
    @FindBy(xpath = "//div[contains(text(),'n1-standard-8 (vCPUs: 8, RAM: 30GB)')]")
    private WebElement selMachTyp;
    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement addGPU;
    @FindBy(xpath="//md-select[@placeholder='GPU type']")
    private WebElement GpuType;
    @FindBy(xpath = "//div[contains(text(),'NVIDIA Tesla V100')]")
    private WebElement selGPUvr;
    @FindBy(xpath="//md-select[@placeholder='Number of GPUs']")
    private WebElement numOfGpu;
    @FindBy(xpath = "//*[@id=\"select_option_497\"]/div[1]")
    private WebElement selNumGPU;
    @FindBy(xpath="//md-select[@placeholder='Local SSD']")
    private WebElement localSsdDropBox;
    @FindBy(xpath="//div[normalize-space()='2x375 GB']")
    private WebElement localSsdModel;
    @FindBy(xpath="//md-select[@placeholder='Datacenter location']")
    private WebElement dataCenterLocDropBox;
    @FindBy(xpath = "//*[@id=\"input_128\"]")
    private WebElement dataCenterLocSearch;
    @FindBy(xpath="//md-option[@id='select_option_253']//div[@class='md-text ng-binding'][normalize-space()='Frankfurt (europe-west3)']")
    private WebElement dataCenterLoc;
    @FindBy(xpath="//md-select[@placeholder='Committed usage']")
    private WebElement commitedUageDropBox;
    @FindBy(xpath="//md-option[@id='select_option_134']")
    private WebElement commitedUsageSel;
    @FindBy(xpath="//form[@name='ComputeEngineForm']//button[@type='button'][normalize-space()='Add to Estimate']")
    private WebElement addToEstimateButton;
    @FindBy(xpath="//div[normalize-space()='Provisioning model: Regular']")
    private WebElement provModel;
    @FindBy(xpath="//div[normalize-space()='Region: Frankfurt']")
    private WebElement location;
    @FindBy(xpath="//div[normalize-space()='Commitment term: 1 Year']")
    private WebElement commitedTime;
    @FindBy(xpath="//div[contains (text(),'Instance type: n1-standard-8')]")
    private WebElement instanceData;
    @FindBy(xpath="//div[contains (text(),'Local SSD: 2x375 GiB')]")
    private WebElement ssdData;
    @FindBy(xpath="//b[contains(text(),'Total Estimated Cost:')]")
    private WebElement amount;

    public Hurt_Me_Plenty(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSearch(){
        searchBttn.click();
    }
    public void enterTxt() throws InterruptedException {

        EnterTxt.click();
        TimeUnit.SECONDS.sleep(3);
        EnterTxt.sendKeys("Google Cloud Platform Pricing Calculator");
        TimeUnit.SECONDS.sleep(2);
        EnterTxt.submit();
        
    }
    public void selGCPC() throws InterruptedException {

        Thread.sleep(5000);
        selGCP.click();
    }

    public void switchToiFrame(){
        driver.switchTo().frame(switchFrame);
        //frame inside frame
        driver.switchTo().frame("myFrame");
    }
    public void selCompEng(){
        compEgin.click();
    }

    public void compEnginFrm() throws InterruptedException {

        numOfInstances.click();
        TimeUnit.SECONDS.sleep(2);

        numOfInstances.sendKeys("4");
        TimeUnit.SECONDS.sleep(2);

        whtInstancesFor.click();
        whtInstancesFor.sendKeys("leave blank");
        TimeUnit.SECONDS.sleep(2);

        series.click();
        TimeUnit.SECONDS.sleep(2);
        seriesType.click();
        TimeUnit.SECONDS.sleep(2);

        machineTyp.click();
        TimeUnit.SECONDS.sleep(2);

        selMachTyp.click();
        TimeUnit.SECONDS.sleep(2);

        addGPU.click();
        TimeUnit.SECONDS.sleep(2);

        GpuType.click();
        Thread.sleep(2000);
        selGPUvr.click();
        TimeUnit.SECONDS.sleep(2);

        numOfGpu.click();
        selNumGPU.click();
        TimeUnit.SECONDS.sleep(2);

        localSsdDropBox.click();
        TimeUnit.SECONDS.sleep(2);
        localSsdModel.click();
        TimeUnit.SECONDS.sleep(2);

        dataCenterLocDropBox.click();
        dataCenterLocSearch.sendKeys("F");
        dataCenterLoc.click();
        TimeUnit.SECONDS.sleep(2);

        commitedUageDropBox.click();
        TimeUnit.SECONDS.sleep(2);
        commitedUsageSel.click();
        TimeUnit.SECONDS.sleep(2);

        addToEstimateButton.click();
        TimeUnit.SECONDS.sleep(2);
    }
    public WebElement getVmClassData(){
        WebElement vmData=provModel;
        return vmData;
    }
    public WebElement getLocation(){
        WebElement loc=location;
        return loc;
    }
    public WebElement getCommitment(){
        WebElement time=commitedTime;
        return time;
    }
    public WebElement getInstanceType(){
        WebElement instance=instanceData;
        return instance;
    }
    public WebElement getSsdData(){
        WebElement ssd=ssdData;
        return ssd;
    }
    public WebElement getCost(){
        WebElement price=amount;
        return price;
    }




}
