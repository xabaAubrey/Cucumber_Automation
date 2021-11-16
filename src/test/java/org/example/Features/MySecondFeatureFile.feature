Feature: Create account of FaceBook
  As a user you need to open facebook home  page and to the validation

  Scenario: Validate First Name field
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user first name
    Then User checks user first name is present