package com.adit.StepDefinition;

import com.adit.PageObject.ChatPage;
import com.adit.PageObject.DashboardPage;
import com.adit.PageObject.HomePage;
import com.adit.PageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ChatStep {
    private WebDriver webDriver;


    public ChatStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("Input \"(.*)\" as email and \"(.*)\" as password")
    public void login(String mail, String pass) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickLoginGoogle();
        loginPage.setEmail(mail);
        Thread.sleep(2000);
        loginPage.clicknext();
        Thread.sleep(2000);
        loginPage.setPass(pass);
        loginPage.clicknext();


    }

    @And("User Go to Home")
    public void paket() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.isDisplayed());
        Thread.sleep(3000);
        homePage.clickPaket();

    }



    @When("User see group chat page")
    public void isLoginSucces() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        Thread.sleep(3000);
        dashboardPage.clickchat();

    }

    @And("User Input \"(.*)\" as a chat")
    public void sendChat(String messagee) throws InterruptedException {
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(2000);
        chatpage.setMessage(messagee);
        Thread.sleep(2000);
        chatpage.clickbtnsend();
        Thread.sleep(2000);
        Assert.assertTrue(chatpage.isDisplayed());
    }

    @Then("User see message appears in group chat")
    public void chattampil()throws InterruptedException{
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(chatpage.isDisplayed());
    }

    @And("Delete message group chat page")
    public void deleteChat() throws InterruptedException {
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatpage.clickarromessage();
        Thread.sleep(4000);
        chatpage.clickarro1message();
        Thread.sleep(4000);
        chatpage.clickdeletemessage();
        Thread.sleep(3000);
        chatpage.clickbtndeletemessage();
    }

    @Then("User see message delete in group chat")
    public void delchattampil()throws InterruptedException{
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(chatpage.isDisplayed());
    }

    @And("Tag \"(.*)\" as member")
    public void tagMember(String messagee) throws InterruptedException {
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatpage.setMessage(messagee);
        Thread.sleep(3000);
        chatpage.clicktag();
        Thread.sleep(3000);
        chatpage.clickbtnsend();
    }

    @Then("User see tag member in group chat")
    public void tagchattampil()throws InterruptedException{
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(chatpage.isDisplayed());
    }

    @And("Attach file \"(.*)\" as file")
    public void attchFile(String atth) throws InterruptedException {
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatpage.clicatth(atth);
        Thread.sleep(3000);
        chatpage.clickbtnsend();
        Assert.assertTrue(chatpage.isDisplayed());
    }

    @Then("User see attch file in group chat")
    public void attchattampil()throws InterruptedException{
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(chatpage.isDisplayed());
    }

    @And("Input 100 characters without spaces \"(.*)\" as a chat")
    public void sendChatnospace(String messagee) throws InterruptedException {
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(2000);
        chatpage.setMessage(messagee);
        Thread.sleep(2000);
        chatpage.clickbtnsend();
//        Thread.sleep(2000);
//        Assert.assertTrue(chatpage.isDisplayed());
    }

    @And("User click button send")
    public void noChat() throws InterruptedException {
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(3000);
        chatpage.clickbtnsend();
    }

    @Then("User can't see message appears in group chat")
    public void nochattampil()throws InterruptedException{
        ChatPage chatpage = new ChatPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(chatpage.isDisplayed());
    }

}

