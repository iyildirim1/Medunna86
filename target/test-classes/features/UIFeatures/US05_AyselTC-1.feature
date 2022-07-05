Feature: US 05
Background: User go to Application Page

   Given user(patient) navigate to 'Medunna' homepage
  Then user(patient) verify the text 'Make an Appoinment'is visible and clickable
  Then user(patient) click 'Make an Appoinment' button

@UIappointment
  Scenario Outline:  Test01: Make an appoinment - Verify Button, First Name cannot be blank


     And   user(patient) verify First name textbox is empty
     And   user (patient) verify Last name textbox is blank
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
     And user(patient) verify if the appoinment date is valid
     Then user(patient) click on Send an Appoinment Request button


  Examples:
    |Firstname|Lastname|SSN|Email|Phone|Date|
    |   |Khann    |190-53-7860|khnnn@gmail.com|231-098-2657|04072022|

