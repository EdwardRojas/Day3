@wiki
Feature: Wiki title and search verifications

  Background: User is on the Wiki home page
    Given User is on the Wikipedia homepage


  Scenario: Search functionality title verification
    When  User searches "Steve Jobs" in the wiki search page
    Then User should see "Steve Jobs" in the wiki title

    Scenario: Search functionality header verification
      When  User searches "Steve Jobs" in the wiki search page
      Then User should see "Steve Jobs" in the main header