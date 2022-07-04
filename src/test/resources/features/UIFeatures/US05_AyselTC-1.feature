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
     And  user(patient) verify notice message Your Firstname is required. is seen

  Examples:
    |Firstname|Lastname|SSN|Email|Phone|Date|
    |   |Khann    |190-53-7860|khnnn@gmail.com|231-098-2657|04072022|













   #Then  user (patient) click Appoinment DateTime dropbox and select date "<Appoinment DateTime>"
  ##And user(patient) confirm the selected date is one of the valid dates
   #And user(patient)click Send an Appoinment Button and validate Toast Container saved message
   # And user(patient) navigate to icon and click both icon and  register button


#   Given User navigate to Registration Page
#   Then User verify the Registration Text is visible
#   Then  User validate the SSN text box is empty
#   Then  User click and provide their "<SSN>" id
#   Then User make sure the SNN box is not blank
#   Then User verify First Name box is blank
#   And  User click and write their "<First Name>"
#   Then User make sure the First Name box is not empty
#   Then User verify Last Name box is empty
#   Then User click and provide their "<Last Name>"
#   And  User make sure the Last Name box is not empty







  #Scenario Outline:  TC-5Registration - verify User Name and Email

    #Given User navigate to Registration Page
    #Then  User verify the Registration Text is visible
    #Then  User validate the Username text box is empty
    #Then  User click and write down their "<Username>"
    #Then User make sure the Username box is not blank
    #Then User verify Email box is blank
    #And  User click and write their "<Email>"
    #And User validate email contains "@" and "." characters
    #Then User make sure the Email box is not empty
#
#
#
#
    #Examples:




# Scenario Outline:  TC-5Registration - verify New password and New password confirmation

#   Given User navigate to Registration Page
#   Then  User verify the Registration Text is visible
#   Then  User validate the New password text box is empty
#   Then  User click and provide their "<New password>"
#   Then  User make sure the New password box is not blank
#   Then  User verify New password confirmation is blank
#   And   User click and write their "<New password confirmation>"
#   And   User make sure the New password confirmation box is not empty
#   Then  User verify Register button is visible and clickable




#   Examples: