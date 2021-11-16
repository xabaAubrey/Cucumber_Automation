Feature: Create account of FaceBook3
  As a user you need to open facebook home  page and to the validation

  Scenario: Validate create user multiple fields31
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When Enter following data
      |userName   |userSurname |Mobile|
      |Linda      |Xaba        |12345 |
      |Than       |Xulu        |12345 |
    Then close browser