Feature: @US_008
  Background: same things


  @PasswordEdit
  Scenario Outline: test editing password
    Given user provides their username as "<username>"
    And user provides their password as "<password>"
    And user clicks on the Sign In button
    Then user navigates to section where the user name information is shown
    When user clicks to Password section in dropdown
    And user enter enters the current password as '<currentPassword>'
    And user enters new password as '<newPassword>'
    And user enters new password confirmation as '<confirmNewPassword>'
    And user saves and changes the old password

    Examples: test data for password change
    |username|password|currentPassword|newPassword|confirmNewPassword|
    |userteam86|userteam86|userteam86|userteam866|userteam866|
    |userteam86|userteam866|userteam866|userteam86|userteam86|


    @PasswordStrengthLevelChart
  Scenario Outline: test password level chart
      Given user provides their username as "<username>"
      And user provides their password as "<password>"
      And user clicks on the Sign In button
      Then user navigates to section where the user name information is shown
      When user clicks to Password section in dropdown
      And user enter enters the current password as '<currentPassword>'
      And user enters 7 chars to new password text box as '<newPassword_7char>'
      And user enters a lowercase char '<newPassword_s>' and level bar changes accordingly
      And user enters an uppercase char as '<newPassword_sA>' and level bar changes accordingly
      And user enters a digit as '<newPassword_sA1>'and level bar changes accordingly
      And user enters a special char as '<newPassword_sA1_>' and level bar changes accordingly

      Examples: required chars for the password strength bar
        |username     |password     |currentPassword|newPassword_7char|newPassword_s|newPassword_sA|newPassword_sA1|newPassword_sA1_|
        |patientteam86|patientteam86|patientteam86  |asdasda          |s            |A             |1              |_               |

    @OldPasswordUsageDisabledAsNewPassword
    Scenario Outline: Old password usage is disabled
      Given user provides their username as "<username>"
      And user provides their password as "<password>"
      And user clicks on the Sign In button
      Then user navigates to section where the user name information is shown
      When user clicks to Password section in dropdown
      And user enter enters the current password as '<currentPassword>'
      And user enters the current password to new password text box as '<currentPassword>'
      And user enters the current password to new password confirmation text box as '<currentPassword>'
      Then user clicks the save button and observes An error has occurred! The password could not be changed. popup message

      Examples: required credentials
        |username     |password        |currentPassword|
        |patientteam86|patientteam86|patientteam86|









