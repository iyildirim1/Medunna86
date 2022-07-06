Feature: Password edit test on homepage

  @PasswordEdit
  Scenario Outline: test editing password
    Given user provides their username as "<username>"
    And user provides their password as "<password>"
    And user clicks on the Sign In button
    Then user navigates to section where the user name information is shown
    When user clicks to Password section in dropdown
    And user enter enters the current password as '<currentPassword>'
    And user enters new password as '<newPassword>'
    And user saves and changes the old password

    Examples: test data for password change
    |username|password|currentPassword|newPassword|
    |userteam86|userteam86|userteam86|userteam866|