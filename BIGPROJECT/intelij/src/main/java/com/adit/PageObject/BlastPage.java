package com.adit.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlastPage {
    private static WebDriver driver;

    public BlastPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".fr-element")
    private WebElement inputtextblast;

    @FindBy(css = ".btn-success")
    private WebElement btnpublish;

    @FindBy(xpath = "//div[@class='CreateBlastPage_inputTitleSection__3vhfz']/textarea[1]")
    private WebElement judulblast;


    @FindBy(css = ".Paper_Paper__27gPv")
    private WebElement verifyblast;

    @FindBy(id = "notistack-snackbar")
    private WebElement verifynoblast;

    @FindBy(xpath = "//div[.='Auto complete']")
    private WebElement autocompl;

    @FindBy(xpath = "//li[.='Set due date manually']")
    private WebElement setduedate;

    @FindBy(xpath = "//input[@id='date-picker-dialog-start']")
    private WebElement tglduedate;


    public void setInputtextblast(String textblast) {

        inputtextblast.sendKeys(textblast);
    }

    public void clickbtnpublish() {
        btnpublish.click();
    }

    public void setjudulblast(String judulinputblast) {

        judulblast.sendKeys(judulinputblast);
    }

    public boolean isDisplayblast(){
        verifyblast.isDisplayed();
        return true;
    }

    public boolean isDisplaynoblast(){
        btnpublish.isDisplayed();
        return true;
    }
    public void clickbautocompl() {
        autocompl.click();
    }

    public void clicksetduedate() {
        setduedate.click();
    }

    public void clicktglduedate() {
        tglduedate.click();
    }

    public void setinputtgl(String inputtgl) {

        tglduedate.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        tglduedate.sendKeys(inputtgl);
    }

}


