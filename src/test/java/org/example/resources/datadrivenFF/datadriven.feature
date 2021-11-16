Feature: Create account of FaceBook2
  As a user you need to open facebook home  page and to the validation

  Scenario Outline: Validate create user multiple fields21
    Given User needs to be on Facebook login page
    And User clicks on button Create New Account
    When User enters user "<firstname>" first name
    And User enters user "<surname>" surname
    Then User checks user "<firstname>" first name is present
    Then User Mobile field should be blank
    Then close browser
    Examples:
      | firstname |   surname   |
      | Aubrey    |   Dlamini   |
      | Cindy     |   Xulu      |
