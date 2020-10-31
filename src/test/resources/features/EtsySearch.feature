@estyAll
Feature: Etsy search feature
  Agile story: User should be able to enter search terms and use
  relevant results in the page and in the title.

  Scenario: Title verification
    Given User is on the stay home page
    Then User should see title is Etsy - Shop for handmade, vintage, custom, and uniques gifts for everyone

  Scenario: Title verification after search term
   When User searches "wooden spoon" in the search box
   And User clicks to search button
    Then User should see "wooden spoon" in the Etsy title

    #expected: Etsy - Shop for handmade, vintage, custom, and uniques gifts for everyone

  Scenario: