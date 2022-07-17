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



    Scenario Outline: TC 002 User can edit all patient information such as; 'id, firstname, lastname, birthdate, email, phone, gender, blood group, address, description, user, country and state/city
      Given user is on the landing page
      And user clicks on the account icon
      And user clicks on SignIn link
      And user enters "<username>" as username and "<password>" as password
      And user clicks on sign-in button
      And user clicks on items and titles on the menu
      Then user clicks on patient portal
      When user clicks on edit
      When user clicks on edit and change Firstname "<firstname>"
      When user clicks on edit and change Lastname "<lastname>"
      When user clicks on edit and change Birthdate "<birthdate>"
      When user clicks on edit and change Email "<email>"
      When user clicks on edit and change Phone "<phone>"
      When user clicks on edit and change Gender "<gender>"
      When user clicks on edit and change Blood Group "<bloodgroup>"
      When user clicks on edit and change Address "<address>"
      When user clicks on edit and change Description "<description>"
      Then user clicks on save changes

      Examples:
      |username||password||firstname||lastname||birthdate||email||phone||gender||bloodgroup||address||description|
      |teamadmin86| |teamadmin86||testFirstName||testLastName||02-02-00202218:36A||testemail@testemail.com||713-832-5050||MALE||A+||Unknown address||Test description|

      @US009_TC003
      Scenario Outline: TC 003 Staff should be able to search a patient by ssn id
        Given Staff logs in to the account with username and password "<username>", "<password>"
        And Staff navigates to the search patient page
        And Staff enters the ssn Id to search "<ssn>"
        Then Verify that the ssn number matches with the one entered "<ssn>"

        Examples:
        |username|password|ssn|
        |staffteam86|staffteam86|321-54-4567|