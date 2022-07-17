Feature: Validate_Appointment_US10
  @Doctor
  Scenario: US10_Validation

    Given Doctor is on the medunna health page and does log in
    Then Doctor goes to my appointments
    Then Doctor can se ID, StartDate, EndDate, etc...

