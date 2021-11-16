Feature: Create account of FaceBook8
  As a user you need to open facebook home  page and to the validation

  Scenario: Validate First Name field81
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user first name
    Then User checks user first name is present
    Then close browser

    Scenario: Validate create user multiple fields82
      Given User needs to be on Facebook login page
      And User clicks on button Create New Account
      When User enters user first name
      And User enters user surname
      Then User checks user first name is present
      Then User Mobile field should be blank
      Then close browser