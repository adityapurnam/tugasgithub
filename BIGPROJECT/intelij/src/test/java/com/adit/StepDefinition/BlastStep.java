package com.adit.StepDefinition;

import com.adit.PageObject.BlastPage;
import com.adit.PageObject.DashboardPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BlastStep {
    private WebDriver webDriver;


    public BlastStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User see blast page")
    public void isBoard() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        Thread.sleep(2000);
        dashboardPage.clickblast();
        Thread.sleep(4000);
        dashboardPage.clickcreateblast();
    }

    @And("Input \"(.*)\" as title and \"(.*)\" as text blast")
    public void createeblast(String judulinputblast, String textblast) throws InterruptedException {
        BlastPage blastPage = new BlastPage(webDriver);
        Thread.sleep(2000);
        blastPage.setjudulblast(judulinputblast);
        Thread.sleep(2000);
        blastPage.setInputtextblast(textblast);
        Thread.sleep(2000);
        blastPage.clickbtnpublish();


    }

    @Then("User see page blast")
    public void verifyblast() throws InterruptedException {
        BlastPage blastPage = new BlastPage(webDriver);
        Thread.sleep(9000);
        Assert.assertTrue(blastPage.isDisplayblast());
    }

    @And("User click publish")
    public void mandatorycreateeblast() throws InterruptedException {
        BlastPage blastPage = new BlastPage(webDriver);
        Thread.sleep(2000);
        blastPage.clickbtnpublish();

    }

    @Then("User can't see page blast")
    public void verifynoblast() throws InterruptedException {
        BlastPage blastPage = new BlastPage(webDriver);
        Thread.sleep(6000);
        Assert.assertTrue(blastPage.isDisplaynoblast());
    }

    @And("Input \"(.*)\" as title and set date \"(.*)\" as blast")
    public void manualduedate(String judulinputblast, String inputtgl) throws InterruptedException {
        BlastPage blastPage = new BlastPage(webDriver);
        blastPage.setjudulblast(judulinputblast);
        Thread.sleep(2000);
        blastPage.clickbautocompl();
        Thread.sleep(2000);
        blastPage.clicksetduedate();
        Thread.sleep(2000);
        blastPage.clicktglduedate();
        blastPage.clicktglduedate();
        Thread.sleep(2000);
        blastPage.setinputtgl(inputtgl);
        Thread.sleep(2000);
        blastPage.clickbtnpublish();
    }

}

