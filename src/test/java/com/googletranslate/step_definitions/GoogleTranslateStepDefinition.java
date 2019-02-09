package com.googletranslate.step_definitions;


import com.googletranslate.pages.GoogleTranslatePage;
import com.googletranslate.utility.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class GoogleTranslateStepDefinition {
    GoogleTranslatePage translatePage = new GoogleTranslatePage();

    @Given("^On Google translate page$")
    public void on_Google_translate_page() throws Throwable {
        translatePage.getPage();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Google Translate"));
    }

    @When("^I choose source language$")
    public void i_choose_source_language() throws Throwable {




        throw new PendingException();
    }

    @When("^I choose target language$")
    public void i_choose_target_language() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I type a word into source field$")
    public void i_type_a_word_into_source_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on translate$")
    public void i_click_on_translate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Translation is displayed$")
    public void translation_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
