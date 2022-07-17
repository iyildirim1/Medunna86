@US11
Feature: US11
  Background:
    Given Physician goes to the Medunna Home Page
    When Physician clicks to Sign In dropdown and Sign In
    Then Physician enters their Username and Password
    And Physician clicks Sign In button
    And Physician navigate to My Pages then click My appointments
    And Physician sees patient's info such as id, start and end date, Status, physician and patient
    And Physician clicks edit button

  Scenario Outline: TC01_02_03
    And Physician fills up the required fields as ->  Anamnesis - Treatment - Diagnosis
    And Physician can chose "<status>" : PENDING, COMPLETED or CANCELLED
    And Physician clicks on Save button
    And verify The appointment is uptated with identifier message shown
    And close the browser

    Examples:
    |status   |
    |CANCELLED|
    |COMPLETED|
    |PENDING|

    Scenario: TC04
      And Physician selects status as UNAPPROVED from dropdown
      And Physician verifies UNAPPROVED cannot be selectable
      And Physician selects status as COMPLETED from dropdown
      And Physician leaves blank required fields, anemnesis, treatment, diagnosis
      And Physician clicks on Save button
      And Physician verifies This field is required message
      And close the browser