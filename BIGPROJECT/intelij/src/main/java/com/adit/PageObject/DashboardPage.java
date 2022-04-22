package com.adit.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage{
    private static WebDriver driver;

    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1")
    private WebElement paketsoal;

    @FindBy(css = ".GroupChatSnapshot_FetchMessages__2k1Xq")
    private WebElement chat;

    @FindBy(xpath ="//h1[.='Board']")
    private WebElement board;

    @FindBy(xpath ="//h1[.='Blast!']")
    private WebElement blast;

    @FindBy(css = ".btn")
    private WebElement createblast;




//
//    @FindBy(css = ".NavHeader_navIconSection__2A2RJ > div:nth-of-type(2) .MuiSvgIcon-root")
//    private WebElement notif;
//
//    @FindBy(css = ".Notification_Notification__1GfaV")
//    private WebElement viewnotif;
//
//    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[2]//div[@class='Message_bodySection__avu8p']")
//    private WebElement verifynotif;



    public boolean isDisplayed() {
        paketsoal.isDisplayed();
        return true;
    }
    public void clickchat() {
        chat.click();
    }

    public void clickboard() {
        board.click();
    }

    public void clickblast() {
        blast.click();
    }

    public void clickcreateblast() {
        createblast.click();
    }

}
