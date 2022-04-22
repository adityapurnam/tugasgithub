package com.adit.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1")
    private WebElement headquarter;

    @FindBy(css = ".Card_Card__2LWWW")
    private WebElement paket;

    public boolean isDisplayed(){
        headquarter.isDisplayed();
        return true;
    }
    public void clickPaket(){
        paket.click();
    }
}
