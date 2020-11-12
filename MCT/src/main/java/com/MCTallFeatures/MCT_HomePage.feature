Feature:MCT Home
  as a user i can navigate to the web site and preform all activities
  Background:User Land on MCT Home page
    Given User enters the URL
    When  User lands on the Home page
#  @amar_Test
  Scenario: User Land on MCT Home page
    Then User should see URL


  Scenario: User can navigate to all the picture in the  Home page

    Given User click on the forward button
    Then User should see a forward home page picture

  Scenario: User can navigate to all the picture in the  Home page
    Given User click on the previous button
    Then User should see a previous home page picture


