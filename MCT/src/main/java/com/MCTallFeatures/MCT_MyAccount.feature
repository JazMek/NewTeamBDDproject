Feature: My Account
  as a logged in user i  can do all my account a activities

  Background:User Land on MCT Home page
    Given User enters the URL
    When  User lands on the Home page
    When User complete login with id "user" password "pass"


  Scenario: User is on his account page
    Given User go to his Account page
    Then User see his account  label

  Scenario: User see all his account option
    Then User see all his account options in below table
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
