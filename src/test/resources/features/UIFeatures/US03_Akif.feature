Feature: US03
  Background:
    Given User goes to Medunna home page
    When User navigates to the registration page
    Then User clicks to password textbox

  Scenario: TC01
    And For a valid passcode, there should be at least 4 chars
    And verify Password strength bar color is red

    Scenario: TC02
      And For a valid passcode, there should be at least 4 chars. There should be at least 7 chars for a stronger password
      And User enters one digit char to password
      And Verify Password strength bar color is orange

      Scenario: TC03
        And For a valid passcode, there should be at least 4 chars. There should be at least 7 chars for a stronger password
        And User enters one digit and uppercase char to password
        And Verify Password strength bar color is light green

        Scenario: TC04
          And For a valid passcode, there should be at least 4 chars. There should be at least 7 chars for a stronger password
          And User enters one digit, uppercase and special char to password
          And Verify Password strength bar color is green

          Scenario: TC05
            And User enters 3 char in the password textbox
            And Verify Password is invalid