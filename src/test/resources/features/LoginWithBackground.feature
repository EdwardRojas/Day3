@loginWithBackground
Feature: Login feature
  Agile Story: As a user, I should be able to login with correct credentials
  to different accounts, and dashboard should be displayed.
   #This is how you comment in feature file

  Background: User is on the login page
    Given User is on the login page

  Scenario: Librarian login scenario
    When User logs in as librarian
    Then User should see dashboard

  Scenario: Student login scenario
    When  User logs in as student
    Then User should see dashboard

  @db
  Scenario: Admin login scenario
    #BeforeStep runs here
    When User logs in as admin
    #AfterStep runs here
    #BeforeStep runs here
    Then User should see dashboard
    #AfterStep runs here
    #After Annotation runs here