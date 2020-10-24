Feature: My Orders
  as a logged in user i  do all order related activities

  Background:User Land on MCT Home page
    Given User enters the URL
    When  User lands on the Home page
    When User complete login with id "user" password "pass"
    When I goto myaccount page

  Scenario: user can see the order history
    And I navigate to order page
    Then I see a table with al lmy orderes
  @amar_Test
  Scenario: user see correct count of place orderes
    And I navigate to order page
    Then I exepct count 10 in my order table