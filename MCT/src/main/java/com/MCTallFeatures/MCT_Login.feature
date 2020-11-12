Feature:MCT Login page
  As a user  of MCT Website i can do a login
  SO i can  do all loggedin activities

  Background:User Land on MCT Home page
    Given User enters the URL
    When  User lands on the Home page
#jaz07
#  jaz mek
  Scenario: User can do a login with valid credentials
When User complete login with id "user" password "pass"
Then User see  profile name as "james williams"