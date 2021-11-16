@Important
Feature: Create account of FaceBook12
  As a user you need to open facebook home  page and to the validation

  @Smoke
  Scenario: Validate First Name field1121
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user "Donald" first name
    Then User checks user "Donald" first name is present
    Then close browser

    @Smoke @Regression
    Scenario: Validate create user multiple fields2122
      Given User needs to be on Facebook login page
      And User clicks on button Create New Account
      When User enters user "Linda" first name
      And User enters user "Xaba" surname
      Then User checks user "Linda" first name is present
      Then User Mobile field should be blank
      Then close browser

  Scenario: Validate First Name field3123
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user "Donald" first name
    Then User checks user "Donald" first name is present
    Then close browser

  @Regression
  Scenario: Validate First Name field4124
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user "Donald" first name
    Then User checks user "Donald" first name is present
    Then close browser

  @Smoke
  Scenario: Validate First Name field5125
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user "Donald" first name
    Then User checks user "Donald" first name is present
    Then close browser

