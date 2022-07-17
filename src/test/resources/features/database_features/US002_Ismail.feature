Feature: US002


  Scenario Outline: TC 002 Check the the username provided is not on the database

    Given Database connection is setup
    Then The username "<username>" provided is checked in the DB systsem for its uniqueness

    Examples:
    |username|
    | sallama  |

    @Database
    Scenario Outline: TC004 User should validate the data in the DB by ssn search
      Given Database connection is setup
      Then the ssn "<ssn>" is checked in the database and get data

      Examples:
      |ssn|
      | 321-54-4567  |


