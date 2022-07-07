Feature: US03
  Background:
    Given User goes to Medunna home page
    When User navigates to the registration page
    Then User clicks to password textbox

  Scenario Outline: TC01
    And User should enter four char "<password>"
    And verify Password strength bar color is red

    Examples:
      |password|
      |asda|
      |asd.|
      |asdA|
      |asd1|

  Scenario Outline: TC02_03_04
    And User should enters at least seven chars "<password>" with one digit or uppercase or special char
    And Verify Password strength bar color is orange

    Examples:
      |password|
      |asdasd1|
      |asdasdA|
      |asdasd.|

  Scenario Outline: TC05
    And User should enters at least seven chars "<password>" with including one digit and uppercase and special char
    And Verify Password strength bar color is green

    Examples:
      |password|
      |asda1A.|
      |asdas1A.|
      |asdas11A.|
      |asdas1AA.|
      |asdas1A./|

  Scenario Outline: TC06
    And User enters three char in the "<password>"
    And Verify Password is invalid

    Examples:
      |password|
      |asda|