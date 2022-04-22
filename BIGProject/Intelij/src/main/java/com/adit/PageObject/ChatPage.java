package com.adit.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {
    public static WebDriver driver;

    public ChatPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1")
    private WebElement groupchat;

    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement message;

    @FindBy(xpath = "//button[@class='rounded-circle btn btn-warning btn-sm']")
    private WebElement btnsend;


    @FindBy(css = ".NavHeader_navIconSection__2A2RJ > div:nth-of-type(2) .MuiSvgIcon-root")
    private WebElement notif;

    @FindBy(css = ".Notification_Notification__1GfaV")
    private WebElement viewnotif;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[2]//div[@class='Message_bodySection__avu8p']")
    private WebElement verifynotif;;

    @FindBy(xpath = "//p[.='ahmad zaky']")
    private WebElement arrowdeletemessage;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//div[@class='Message_iconOption__3qihj']")
    private WebElement arrow1deletemessage;

    @FindBy(xpath = "//p[.='Delete Message']")
    private WebElement deletemessage;

    @FindBy(css = ".Button_container__1WNuB")
    private WebElement btndeletemessage;

    @FindBy(css = ".tribute-container")
    private WebElement tag;

    @FindBy(xpath = "//input[1]")
    private WebElement attch;

    @FindBy(xpath = "//time[.='just now']")
    private WebElement verifyjam;

    public boolean isDisplayed(){
        groupchat.isDisplayed();
        return true;
    }

    public void setMessage(String messagee) {

        message.sendKeys(messagee);
    }
    public void clickbtnsend() {
        btnsend.click();
    }

    public void clicknotif() {
        notif.click();
    }

    public void clickviewnotif() {
        viewnotif.click();
    }

    public boolean Displayed(){
        verifynotif.isDisplayed();
        return true;
    }

    public void clickarromessage() {
        arrowdeletemessage.click();
    }

    public void clickarro1message() {
        arrow1deletemessage.click();
    }

    public void clickdeletemessage() {
        deletemessage.click();
    }

    public void clickbtndeletemessage() {
        btndeletemessage.click();
    }

    public void clicktag() {
        tag.click();
    }

    public void clicatth(String atth) {
        attch.sendKeys(atth);
    }

    public boolean Displayjam(){
        verifyjam.isDisplayed();
        return true;
    }

}

