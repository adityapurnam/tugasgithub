package com.adit.StepDefinition;

import com.adit.PageObject.BoardPage;
import com.adit.PageObject.DashboardPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BoardStep {
    private WebDriver webDriver;


    public BoardStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User see board page")
    public void isBoard() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        Thread.sleep(2000);
        dashboardPage.clickboard();
//        Thread.sleep(2000);
//        dashboardPage.clicknotif();
//        Thread.sleep(5000);
//        dashboardPage.clickviewnotif();

    }

    @And("Create add card \"(.*)\" as board")
    public void addCard(String cardnme) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickaddcard();
        boardPage.setcardname(cardnme);
        boardPage.clickbtnaddcard();
    }

    @Then("User see add card")
    public void verifaddcard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(boardPage.Displayed());
    }


    @And("User click add card")
    public void checkmandatoryaddCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickaddcard();
        Thread.sleep(2000);
        boardPage.clickbtnaddcard();
    }

    @Then("User failed add new card")
    public void verifcheckmandatoryCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(boardPage.cardDisplayed());
    }

    @And("Input notes \"(.*)\" as board")
    public void notes(String notes) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(2000);
        boardPage.clickeditnotes();
        Thread.sleep(3000);
        boardPage.clearinputnotes(notes);
        boardPage.setinputnotes(notes);
        Thread.sleep(3000);
        boardPage.clickbtnsave();

    }

    @Then("User see notes")
    public void verifynotes() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(boardPage.Display());

    }


    @Then("Update notes \"(.*)\" as board")
    public void updatenotes(String notes) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(2000);
        boardPage.clickeditnotes();
        Thread.sleep(3000);
        boardPage.clearinputnotes(notes);
        boardPage.setinputnotes(notes);
        Thread.sleep(8000);
        boardPage.clickbtnsave();
        Assert.assertTrue(boardPage.Display());
        Thread.sleep(3000);

    }

    @And("Input name label \"(.*)\" and the color of the label card appears")
    public void createlabel(String label) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(2000);
        boardPage.clickeditlabel();
        boardPage.clickcreatenewlabel();
        boardPage.setinputnamelabel(label);
        Thread.sleep(2000);
        boardPage.clickcolourlabel();
        Thread.sleep(3000);
        boardPage.clickbtnsave();
        Thread.sleep(3000);
        boardPage.clicklowlabel();

    }

    @Then("User see colour label")
    public void verifycreatelabel() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(3000);
        Assert.assertTrue(boardPage.display());
    }


    @And("Input comment \"(.*)\" as page coloumn comment")
    public void comment(String notes) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(2000);
        boardPage.clickquiccomment();
        Thread.sleep(3000);
        boardPage.clickcomment();
        Thread.sleep(3000);
        boardPage.setinputnotes(notes);
        boardPage.clickbtnsave();


    }

    @Then("User see comment on board page")
    public void verifycomment() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(boardPage.Displaycomment());
    }


    @And("Input comment \"(.*)\" as emoticon")
    public void emoticoncomment(String notes) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(2000);
        boardPage.clickquiccomment();
        Thread.sleep(3000);
        boardPage.clickcomment();
        Thread.sleep(3000);
        boardPage.clickemoticon();
        Thread.sleep(3000);
        boardPage.clickpilemoticon();
        Thread.sleep(3000);
        boardPage.setinputnotes(notes);
        boardPage.clickbtnsave();
    }

    @And("User Attach file in board \"(.*)\" as file")
    public void board(String file) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(4000);
        boardPage.clickattchment(file);


    }

    @Then("User see attch file in card")
    public void verifyatt() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        Assert.assertTrue(boardPage.Displaycomment());
    }


    @And("Input change name \"(.*)\" as board")
    public void changename(String editcardname) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Thread.sleep(2000);
        boardPage.clickeditcard();
        Thread.sleep(2000);
        boardPage.clickchangename();
        Thread.sleep(2000);
        boardPage.cleareditcardname(editcardname);
        Thread.sleep(2000);
        boardPage.seteditcardname(editcardname);
        boardPage.clickbtnsave();
    }
}
