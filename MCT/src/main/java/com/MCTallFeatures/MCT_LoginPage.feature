Feature: Login to MCT Home Account
  Scenario:Sign Up to MCT
    Given User lands on MCT Home Page
    When  User clicks on LOGIN button
    And   User clicks on SING UP button
    Then  User should be directed to "https://www.demo.iscripts.com/multicart/demo/register.php"
  Scenario: Register to MCT
    Given User lands on "https://www.demo.iscripts.com/multicart/demo/register.php"
    When  User enters
    |E-mail|User Name|Password|Confirm Password|First Name|Last Name|Address|
    Then  User clicks on CREATE ACCOUNT button

