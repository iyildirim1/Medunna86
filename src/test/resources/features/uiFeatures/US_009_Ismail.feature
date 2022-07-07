Feature: US_009


  Scenario Outline: TC 001 view patient information navigating to view portal

    Given  user is on the landing page
    And user clicks on the account icon
    And user clicks on SignIn link
    And user enters "<username>" as username and "<password>" as password
    And user clicks on sign-in button
    And user clicks on items and titles on the menu
    Then user clicks on patient portal
    And user sees the Patient Header

    Examples:
    |username| |password|
    |teamadmin86| |teamadmin86|

  @deneme
    Scenario Outline: TC 002 User can edit all patient information such as; 'id, firstname, lastname, birthdate, email, phone, gender, blood group, address, description, user, country and state/city
      Given user is on the landing page
      And user clicks on the account icon
      And user clicks on SignIn link
      And user enters "<username>" as username and "<password>" as password
      And user clicks on sign-in button
      And user clicks on items and titles on the menu
      Then user clicks on patient portal
      When user clicks on edit
      When user clicks on edit and change ID "<id>"
      When user clicks on edit and change Firstname "<firstname>"
      When user clicks on edit and change Lastname "<lastname>"
      When user clicks on edit and change Birthdate "<birthdate>"
      When user clicks on edit and change Email "<email>"
      When user clicks on edit and change Phone "<phone>"
      When user clicks on edit and change Gender "<gender>"
      When user clicks on edit and change Blood Group "<bloodgroup>"
      When user clicks on edit and change Address "<address>"
      When user clicks on edit and change Description "<description>"
      When user clicks on edit and change User "<user>"
      When user clicks on edit and change Country "<country>"
      When user clicks on edit and change State-City "<statecity>"

      Examples:
      |username||password||id||firstname||lastname||birthdate||email||phone||gender||bloodgroup||address||description||user||country||statecity|
      |teamadmin86| |teamadmin86||202030||testFirstName||testLastName||09/05/1990||testemail@testemail.com||713-832-5050||male||A+||Unknown address||Test description||testuser1096||USA||Texas/Houston|