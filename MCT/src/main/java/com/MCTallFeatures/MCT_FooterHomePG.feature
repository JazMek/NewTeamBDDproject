# new feature

Feature: Footer of Home Page

  Background:
    Given User lands on MCT Home Page
#  @rachidTests
  Scenario: verify links at Footer Home page if are displayed as expected
    Then  user scroll down to footer home page and see all the Links
  @rachidTests
  Scenario: verify the links at the footer are clickable
      Then user scroll down to footer
      And  click on View Cart link
#  @rachidTests
#  Scenario Outline: verify links at Footer Home page
#    When user "<user>" and "<amar>"
#    Then  user enter "<total>" and "<number>"
#    Examples:
#    |number | total    | amar | user|
#     | $ 34.22 |  45.3 | 4    | max  |