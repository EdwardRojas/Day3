package com.cybertek.step_definitions;


import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        //Assert.fail("Failing for practice!!!");
        Driver.getDriver().get("https://www.google.com");


    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals("Actual title does not match expected title", actualTitle,expectedTitle);

    }


    @When("User searches apple")
    public void userSearchesApple() {

        //creating the page object
        //GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        //sending valueinto search box using page model
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("User searches {string}")
    public void userSearches(String searchValue) {

        //GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String expectedTitle = searchValue+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        Assert.assertTrue(googleSearchPage.AboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        googleSearchPage.AboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {

        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
