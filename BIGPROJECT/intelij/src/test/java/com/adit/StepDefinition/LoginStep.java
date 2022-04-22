package com.adit.StepDefinition;

import com.adit.PageObject.HomePage;
import com.adit.PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    private WebDriver webDriver;


    public LoginStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User navigate to login home page")
    public void loginHomePage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Thread.sleep(1000);
        loginPage.clickLoginGoogle();
    }

    @When("User input \"(.*)\" as email and \"(.*)\" as password")
    public void SignIn(String mail, String pass)throws InterruptedException{
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmail(mail);
        Thread.sleep(3000);
        loginPage.clicknext();
        Thread.sleep(3000);
        loginPage.setPass(pass);
        Thread.sleep(3000);
        loginPage.clicknext();
    }

    @Then("User see homepage")
    public void isLoginSucces() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(homePage.isDisplayed());
    }
}
