Feature: US11
  Scenario:
    Given Physician goes to the Medunna Home Page
    When Physician click to Sign In and write Username and Password
    Then Physician clicks Sign In button
    And Physician navigate to My Pages then click My appointments
    And Doctor sees patient's info such as id, start and end date, Status, physician and patient
    And Physician clicks edit button
    And Doctor fills up the required fields as ->  Anamnesis - Treatment - Diagnosis
    And Doctor can chose one of these options: PENDING, COMPLETED or CANCELLED
    And Doctor clicks save button
    And verify The appointment is uptated with identifier message shown
