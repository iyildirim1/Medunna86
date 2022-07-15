@Us002
Feature: US 002

@deneme
 Scenario Outline: TC 001 Choose a username that can contain any chars, but it cannot be blank

   Given user is on the landing page
   And user clicks on the account icon
   And user clicks on the registration link
   And user enters the ssn "<ssn>"
   And user enters the firstname "<firstname>"
   And user enters the lastname "<lastname>"
   And user enters the username "<username>"
   And user enters the email "<email>"
   And user enters the password "<password>"
   And user confirms the password "<password>"
   Then user clicks on submit button
   Then user doesn't get invalid username message

   Examples:
   |username|
   |testusername|



  Scenario Outline: TC 003 email id cannot be created without "@" sign and "." extension

    Given user is on the landing page
    And user clicks on the account icon
    And user clicks on the registration link
    And user enters the "<email>" as email
    Then user clicks on submit button
    Then user doesn't get invalid email message

    Examples:
    |email|
    |testemail@testemail.com|
    |testemailtestemail.com|
    |testemail@testemailcom|


    Scenario: TC 004 email cannot be left blank
      Given user is on the landing page
      And user clicks on the account icon
      And user clicks on the registration link
      Then user clicks on submit button without entering email
      Then user gets an error message as -Your email is required.-




