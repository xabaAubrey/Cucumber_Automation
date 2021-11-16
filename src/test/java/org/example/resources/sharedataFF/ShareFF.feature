Feature: Create account of FaceBook10
  As a user you need to open facebook home  page and to the validation

  Scenario: Validate First Name field101
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user "Donald" first name
    Then User checks user "Donald" first name is present

    Scenario: Validate create user multiple fields102
      Given User needs to be on Facebook login page
      And User clicks on button Create New Account
      When User enters user "Linda" first name
      And User enters user "Xaba" surname
      Then User checks user "Linda" first name is present
      Then User Mobile field should be blank