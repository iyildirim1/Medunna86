Feature: US 002


 Scenario Outline: TC 001 Choose a username that can contain any chars, but it cannot be blank

   Given user is on the landing page
   And user clicks on the account icon
   And user clicks on the registration link
   And user enters the "<username>" as username
   Then user clicks on submit button
   Then user doesn't get invalid username message

   Examples:
   |username|
   |testusername|
   |test username|



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




