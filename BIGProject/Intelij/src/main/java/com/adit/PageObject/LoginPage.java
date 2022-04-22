package com.adit.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//span[.='Buat akun']")
    private WebElement akun;

    @FindBy(id = "firstName")
    private WebElement firstname;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@name='ConfirmPasswd']")
    private WebElement confirmpassword;

    @FindBy(xpath = "//p[.='Login with Google Account']")
    private WebElement logingoogle;

    @FindBy(id = "identifierId")
    private WebElement email;


    @FindBy(xpath = "//span[.='Berikutnya']")
    private WebElement next;

    @FindBy(id = "phoneNumberId")
    private WebElement telp;

    @FindBy(xpath = "//span[.='Coba lagi']")
    private WebElement cobalagi;


    @FindBy(id = "password")
    private WebElement passlogin;

    public void clickakun() {
        akun.click();
    }

    public void setFirstname(String namadepan) {

        firstname.sendKeys(namadepan);
    }

    public void setLastname(String namabelakang) {

        lastName.sendKeys(namabelakang);
    }

    public void setUsername(String namaemail) {

        username.sendKeys(namaemail);
    }

    public void setPass(String pass) {

        password.sendKeys(pass);
    }

    public void setConfirmpass(String confirmpass) {

        confirmpassword.sendKeys(confirmpass);
    }

    public void setTelp(String notelp) {

        telp.sendKeys(notelp);
    }

    public void clickLoginGoogle() {
        logingoogle.click();
    }

    public void setEmail(String mail) {

        email.sendKeys(mail);
    }

    public void setPasslogin(String paslogin) {

        passlogin.sendKeys(paslogin);
    }

    public void clicknext() {

        next.click();
    }

    public void clickcoba() {
        cobalagi.click();
    }

    public static class App {
    }
}

