package ruut.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyPage extends BasePage {


    @FindBy(xpath = "//*[text()=' Driver ']")
    public WebElement driver;
    @FindBy(xpath = "//*[text()=' Biker ']")
    public WebElement biker;
    @FindBy(xpath = "//*[text()=' Advertiser ']")
    public WebElement advertiser;
    @FindBy(xpath = "//*[text()=' Screen Investor ']")
    public WebElement screenInvestor;

    @FindBy(xpath = "//*[text()='Drivers generate extra income by simply integrating Ruut Smart Screens on their cars.']")
    public WebElement driverExp;
    @FindBy(xpath = "//*[text()='Bikers generate extra income by simply integrating Ruut Smart Screens on their bikes.']")
    public WebElement bikerExp;
    @FindBy(xpath = "//*[text()='Brands and agencies reach audiences via hyper-local, measurable and targeted outdoor campaigns with Ruut Smart Screens.']")
    public WebElement advertiserExp;
    @FindBy(xpath = "//*[text()='People generate extra income by purchasing Ruut Smart Screens and having Ruut operate them across its vehicle network.']")
    public WebElement screenInvestorExp;



}
