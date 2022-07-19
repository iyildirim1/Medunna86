

Feature:

  @US04_TC01
  Scenario Outline:TC_01
  Given User goes to Medunna url
   And click sign in icon
   And click first sign in button
  And enter a valid "<username>"
  And user enter "<password>"
  Then click sign in

Examples:
    |username|password|
    |userteam86|userteam86|

  @US04_TC02
  Scenario Outline:Verifies Remember me Options
    Given User goes to Medunna url
    And click sign in icon
    And click first sign in button
    And enter a valid "<username>"
    And user enter "<password>"
   Then Verifies Remember me options
    Examples:
      |username|password|
      |userteam86|userteam86|

  @US04_TC03
  Scenario Outline:Verifies Did You Forget Password
    Given User goes to Medunna url
    And click sign in icon
    And click first sign in button
    And enter a valid "<username>"
    And user enter "<password>"
    Then Verifies Did You Forget Password
    Examples:
      |username|password|
      |userteam86|userteam86|


  @US04_TC04
  Scenario Outline:Verifies Register a new account
    Given User goes to Medunna url
    And click sign in icon
    And click first sign in button
    And enter a valid "<username>"
    And user enter "<password>"
    Then Verifies Registration Page
    Examples:
      |username|password|
      |userteam86|userteam86|



  @US04_TC05
  Scenario Outline:Verifies cancel login option
    Given User goes to Medunna url
    And click sign in icon
    And click first sign in button
    Then click to cancel button
    Examples:






  @US13_TC01
Scenario Outline: US_13

    Given User goes to Medunna url
    And click sign in icon
    And click first sign in button
    And enter a valid "<username>"
    And user enter "<password>"
    And click sign in
    And click to my page segment
    And click my appointments
    And click edit button
    And click show test result
    And click view results
    Then verify test information id,name,default min,default max,test,description,date


    Examples:

    |username|password|
    |makbaba|Akbaba.1993|





