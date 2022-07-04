Feature: US 05
  Background: User go to Application Page

    Given user(patient) navigate to 'Medunna' homepage
    Then user(patient) verify the text 'Make an Appoinment'is visible and clickable
    Then user(patient) click 'Make an Appoinment' button

  @UIappointment
  Scenario Outline:  Test01: Make an appoinment - Verify Button,Appoinment Date  cannot be chosen past dates


    And   user(patient) verify First name textbox is empty
    Then  user (patient) click textbox and enter their "<Firstname>"
    Then user(patient) verify Fist name textbox is full
    And user(patient) verify Last name textbos is clear
    And   user(patient) click Last name textbox and enter  "<Lastname>"
    And   user (patient) verify Last Name textbox is not blank
    And   user(patient) verify SSN textbox is blank
    Then  user (patient) click textbox and enter ssn number "<SSN>"
    And   user (patient) verify ssn textbox is not blank
    Then user(patient) verify email textbox is blank
    Then user(patient) write "<Email>"
    Then  user(patient) verify that @ and . sign are used
    And user(patient) verify email textbox is not blank
    And user(patient) verify Phone textbox is empty
    Then  user (patient) click Phone textbox and write valid "<Phone>"
    And user(patient) verify used dash after the third and sixth digits
    And user(patient) verify Phone textbox is not clean
    Then user(patient) click on the Appoinment Date icon
    Then user(patient)verify the up-to-date date time
    And user(patient) click Send an Appoinment Request
    And user(patient) verify toast container message Appoinmnet Registration Saved

    #And user(patient) select past date for making appointment
   # And  user(patient) verify warning message Appoinment date can not be past date!

    Examples:
      |Firstname|Lastname|SSN|Email|Phone|Date|
      |Mehmet   |Acarr   |212-44-2190 |meh@gmail.com|345-786-9086 | |