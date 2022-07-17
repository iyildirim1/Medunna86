
@US_14
Feature:US_14
  Background: open_url
    Given Doctor  navigates to medunnaUrl homepage
    When  Doctor navigate to the Sign In page
    And   Doctor types username as "akbabadoctor"
    And   Doctor types password as "Akbaba.1993"
    And Doctor clicks Sign In button
    And Doctor navigate to the My Pages

  @TC01
  Scenario: TC01
    And   clicks My Inpatients
    And verifies all Inpatients as ID, Start Date, End Date, Status, Description, Created Date, Room, Appointment, Patient
    And close driver

#    First Acceptance Criteria


 @TC02
  Scenario:unapproved
   And   clicks My Inpatients
  And clicks edit  button on "UNAPPROVED" patients
 And update description
  And click save button
   Then verifies  the success message is displayed
   And close driver
   Then verifies the error message is displayed

  @TC03
  Scenario:Update Created Date
    And   clicks My Inpatients
    And clicks edit  button on "UNAPPROVED" patients
    And update created date "12/27/2023"
    And click save button
    Then verifies  the success message is displayed
    And close driver
#    bug var burda green success message cikiyor ancak table da gorunmuyor
#    Then verifies the error message is displayed

  @TC04
  Scenario:Update Status
    And   clicks My Inpatients
    And clicks edit  button on "UNAPPROVED" patients
    And update status to Staying
    And click save button
    Then verifies  the Such a room not found error message is displayed
    And close driver


  @TC05
  Scenario:Update status
    And   clicks My Inpatients
    And clicks edit  button on "UNAPPROVED" patients
    And update status to CANCELLED
    And click save button
    Then verifies  the success message is displayed
    And close driver

  @TC06
  Scenario: Updates Created Date on Staying
    And   clicks My Inpatients
    And clicks edit  button on "STAYING" patients
    And update created date "12/27/2023"
    And click save button
    Then verifies  the success message is displayed
    And close driver
  @TC07
  Scenario: Updates Description on Staying
    And   clicks My Inpatients
    And clicks edit  button on "STAYING" patients
    And update description
    And click save button
    Then verifies  the success message is displayed
    And close driver

  @TC08
  Scenario:Update Status on Staying
    And   clicks My Inpatients
    And clicks edit  button on "STAYING" patients
    And Update status to DISCHARGED
    And click save button
    Then verifies  the success message is displayed
    And close driver
  @TC09
  Scenario:Update Status on Staying
    And   clicks My Inpatients
    And clicks edit  button on "STAYING" patients
    And Update status to UNAPPROVED
    And click save button
    Then verifies the error message is displayed
    And close driver
  @TC010
  Scenario:Update Status on Staying
    And   clicks My Inpatients
    And clicks edit  button on "STAYING" patients
    And update status to CANCELLED
    And click save button
    Then verifies the error message is displayed
    And close driver

  @TC011
  Scenario:Update Description on Discharged
    And   clicks My Inpatients
    And clicks edit  button on "DISCHARGED" patients
    And update description
    And click save button
    Then verifies the error message is displayed
    And close driver
  @TC012
  Scenario:Update Created Date on Discharged
    And   clicks My Inpatients
    And clicks edit  button on "DISCHARGED" patients
    And update created date "12/27/2023"
    And click save button
    Then verifies the error message is displayed
    And close driver
  @TC013
  Scenario:Update Status on Discharged
    And   clicks My Inpatients
    And clicks edit  button on "DISCHARGED" patients
    And Update status to UNAPPROVED
    And click save button
    Then verifies the error message is displayed
    And close driver





  @AC3_TC01
  Scenario:Update Room
    And   clicks My Inpatients
    And clicks edit  button on "UNAPPROVED" patients
    And select a  room with available room
    And click save button
    Then verifies  the success message is displayed
    And close driver
#    But not showing in to table There is a bug

  @TC02
  Scenario: Update Room
    And   clicks My Inpatients
    And clicks edit  button on "UNAPPROVED" patients
    And update room with unavailable room
    And click save button
    Then verifies  the success message is displayed
    And close driver
    #    But not showing in to table there is  bug
  @TC03
  Scenario: Update Room
    And   clicks My Inpatients
    And clicks edit  button on "STAYING" patients
    And select a  room with available room
    And click save button
    Then verifies  the success message is displayed
    And close driver
#  // burada bug var success message veriyor ama table da degismiyor
  @AC3_TC04
  Scenario:Update Room
    And   clicks My Inpatients
    And clicks edit  button on "DISCHARGED" patients
    And select available room
    And click save button
    Then verifies the error message is displayed
    And close driver
  @AC3_TC05
  Scenario:Select Room
    And   clicks My Inpatients
    And clicks edit  button on "UNAPPROVED" patients
    And update status to Staying
    And select available room
    And click save button
    Then verifies  the success message is displayed
    And close driver

  @US12_TC01
  Scenario:Request A Test
  And click MY Appointments
  And click edit button on my appointments
  And click Request A  Test
 Then Verifies Test Items Info as ID and Name
    And close driver
  @US12_TC02
  Scenario: Request A Test
    And click MY Appointments
    And click edit button on my appointments
    And click Request A  Test
    Then verifies items as checkmark options;Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin
    And close driver
#  @US12_TC03
#  Scenario: Request A Test
#    And click MY Appointments
#    And click edit button on my appointments
#    And click Request A  Test
#    Then verifies item as checkmark option; Glucose










