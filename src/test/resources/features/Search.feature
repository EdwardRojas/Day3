Feature: Search

  Agile Story: as a user, I should be able to search when I am on Google search

  Background:User is on the google search page
    Given User is on the google search page

  Scenario: Google default title verification
    #Given User is on the google search page
    Then User should see title is Google

  Scenario: Google title verification after search
    #Given User is on the google search page
    When User searches apple
    Then User should see apple in the title

      @wpi
  Scenario: Scenario: Google title verification after search
        When User searches "cherry"
        Then User should see "cherry" in the title

  Scenario: Google -About- link page title verification
    Then User should see About link
    And User clicks to About link
    Then User should see title Google - About Google, Our Culture & Company News
