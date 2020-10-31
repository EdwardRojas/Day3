package com.cybertek.step_definitions;

import com.cybertek.pages.EtsySearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

    EtsySearchPage etsyStepPage = new EtsySearchPage();

    @Given("User is on the stay home page")
    public void user_is_on_the_stay_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }


    @Then("User should see title is Etsy - Shop for handmade, vintage, custom, and uniques gifts for everyone")
    public void user_should_see_title_is_etsy_shop_for_handmade_vintage_custom_and_uniques_gifts_for_everyone() {

        String actual = Driver.getDriver().getTitle();
        String expected = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(actual,expected);
    }

    @When("User searches {string} in the search box")
    public void userSearchesInTheSearchBox(String searchValue) {
        etsyStepPage.searchBox.sendKeys(searchValue);

    }

    @And("User clicks to search button")
    public void userClicksToSearchButton() {
        etsyStepPage.searchButton.click();
    }

    @Then("User should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String expectedInTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
}
