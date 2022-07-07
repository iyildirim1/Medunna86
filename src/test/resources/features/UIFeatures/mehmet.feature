Feature:



  @TC_01
  Scenario Outline: TC01

    Given Doctor  navigates to medunnaUrl homepage
    When  Doctor navigate to the Sign In page
    And   Doctor types username as "<username>"
    And   Doctor types password as "<password>"
    And Doctor clicks Sign In button
    And Doctor navigate to the My Pages
    And   clicks My Inpatients
    Then close the driver


    Examples: Sign In Page
      |username|password|
      |doctor79|doctor  |


  @US14_TC02
  Scenario Outline:TC02

    Given Doctor  navigates to medunnaUrl homepage
    When  Doctor navigate to the Sign In page
    And   Doctor types username as "<username>"
    And   Doctor types password as "<password>"
    And Doctor clicks Sign In button
    And Doctor navigate to the My Pages
    And  clicks My Inpatients
    And Doctor clicks edit button
    And Doctor update status
    Then Clicks save button


    Examples: Sign In Page
      |username|password|
      |doctor79|doctor  |


  @TC14_TC03
  Scenario Outline:TC03

    Given Doctor  navigates to medunnaUrl homepage
    When  Doctor navigate to the Sign In page
    And   Doctor types username as "<username>"
    And   Doctor types password as "<password>"
    And Doctor clicks Sign In button
    And Doctor navigate to the My Pages
    And  clicks My Inpatients
    And Doctor clicks edit button
    And Doctor can update room
    Then Clicks save button


    Examples: Sign In Page
      |username|password|
      |doctor79|doctor  |
