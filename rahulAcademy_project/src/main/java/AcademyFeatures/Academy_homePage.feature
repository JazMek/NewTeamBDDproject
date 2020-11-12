Feature: autosuggestion menu dropDown

  Scenario: Verify autosuggestion menu is working
    Given user open url and navigate to academy rahul Home page
    When user write the word "fr" at autosuggestion menu dropDown
    Then user can see all country suggestions list and can select the country

