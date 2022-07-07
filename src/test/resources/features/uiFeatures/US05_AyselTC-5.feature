Feature: US 05
  Background: User go to Application Page

    Given user(patient) navigate to 'Medunna' homepage
    Then user(patient) verify the text 'Make an Appoinment'is visible and clickable
    Then user(patient) click 'Make an Appoinment' button

  @UIappointment
  Scenario Outline:  Test01: Make an appoinment - Verify Button,Phone textbox cannot be empty


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

    And user(patient) verify if the appoinment date is valid
    Then user(patient) click on Send an Appoinment Request button
    And  user(patient) verify notice message Phone number is required. is noted

    Examples:
      |Firstname|Lastname|SSN|Email|Phone|Date|
      |Memet   |Aci   |230-44-1908 |memet@gmail.com|    |04072022|