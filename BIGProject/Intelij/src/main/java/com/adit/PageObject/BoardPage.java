package com.adit.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {
    public static WebDriver driver;

    public BoardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Add Card']")
    private WebElement addcard;

    @FindBy(css = "[placeholder='Card name']")
    private WebElement cardname;


    @FindBy(css = ".MuiCollapse-container")
    private WebElement notifcard;


    @FindBy(css = ".btn-success")
    private WebElement btnaddcard;

    @FindBy(css = ".MuiCollapse-container")
    private WebElement createcard;

    @FindBy(id = "editCardMenu")
    private WebElement editcard;

    @FindBy(xpath = "//div[.='Edit Notes']")
    private WebElement editnotes;

    @FindBy(css = ".fr-element")
    private WebElement inputnotes;

    @FindBy(css = ".btn-success")
    private WebElement btnsave;

    @FindBy(css = ".BoardLayout_BoardLayout__1vgtV")
    private WebElement verifynotes;

    @FindBy(xpath = "//div[.='Edit Labels']")
    private WebElement editlabel;

    @FindBy(css = "[placeholder='Input name']")
    private WebElement inputnamelabel;

    @FindBy(css = ".btn-light")
    private WebElement createnewlabel;

    @FindBy(xpath = "//div[13]")
    private WebElement colourlabel;


    @FindBy(css = ".ToggleLabels_ToggleLabelsContainer__smallTitle__3NSG1")
    private WebElement verifycolourlabel;

    @FindBy(xpath = "//p[.='low']")
    private WebElement lowlabel;

    @FindBy(css = ".ToggleLabels_ToggleLabelsContainer__editIcon__3v47q")
    private WebElement iconpenlabel;

    @FindBy(css = ".EditLabel_sectionFooter__3wl28")
    private WebElement footerdelete;

    @FindBy(css = ".btn-danger")
    private WebElement btndeletelabel;

    @FindBy(xpath = "//div[.='Quick Comment']")
    private WebElement quiccomment;

    @FindBy(css = "[placeholder='Add new comment...']")
    private WebElement comment;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]//div[@class='RoundActionMenu_container__2ta8s']")
    private WebElement verifycomment;

    @FindBy(xpath = "//div[.='Change Name']")
    private WebElement changename;

    @FindBy(name = "name")
    private WebElement editcardname;

    @FindBy(xpath = "//input[1]")
    private WebElement attchfile;


    @FindBy(xpath ="//button[.='Emoticons']")
    private WebElement emoticon;

    @FindBy(xpath ="//span[4]")
    private WebElement pilihemoticon;


    @FindBy(id = "editCardMenuButton__ChangeAccess_text")
    private WebElement privatecard;



    public void clickaddcard() {
        addcard.click();
    }

    public void setcardname(String cardnme) {

        cardname.sendKeys(cardnme);
    }

    public void clickbtnaddcard() {
        btnaddcard.click();
    }

    public boolean cardDisplayed() {
        notifcard.isDisplayed();
        return true;
    }

    public boolean Displayed() {
        createcard.isDisplayed();
        return true;
    }

    public void clickeditcard() {
        editcard.click();
    }

    public void clickeditnotes() {
        editnotes.click();
    }

    public void setinputnotes(String notes) {

        inputnotes.sendKeys(notes);

    }

    public void clearinputnotes(String notes) {

        inputnotes.clear();

    }

    public void clickbtnsave() {
        btnsave.click();
    }

    public boolean Display() {
        verifynotes.isDisplayed();
        return true;
    }

    public void clickeditlabel() {
        editlabel.click();
    }

    public void setinputnamelabel(String label) {

        inputnamelabel.sendKeys(label);

    }

    public void clickcreatenewlabel() {
        createnewlabel.click();
    }

    public void clickcolourlabel() {
        colourlabel.click();
    }

    public boolean display() {
        verifycolourlabel.isDisplayed();
        return true;
    }

    public void clicklowlabel() {
        lowlabel.click();
    }

    public void clickiconpenlabel() {
        iconpenlabel.click();
    }

    public void clickbtndeletelabel() {
        btndeletelabel.click();
    }

    public void clickfooterdelete() {
        footerdelete.click();
    }

    public void clickquiccomment() {
        quiccomment.click();
    }



    public void clickcomment() {

        comment.click();
    }

    public boolean Displaycomment() {
        verifycomment.isDisplayed();
        return true;
    }

    public void clickchangename() {

        changename.click();
    }

    public void cleareditcardname(String editcardnme) {

        editcardname.clear();

    }

    public void seteditcardname(String editcardnamee) {

        editcardname.sendKeys(editcardnamee);

    }

    public void clickattchment(String file) {
        attchfile.sendKeys(file);
    }

    public void clickemoticon() {
        emoticon.click();
    }

    public void clickpilemoticon() {
        pilihemoticon.click();
    }

    public void clickprivcard() {
        privatecard.click();
    }
}
