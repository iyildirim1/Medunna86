Feature: US_017


  Scenario: TC 001 Admin can create new test items

    Given Admin logins to the platform
    And Admin clicks on Items&Titles
    And Admin clicks on Test Item
    And Admin clicks on Create a New Test Item
    Then Admin verifies Create or edit a Test Item header



    Scenario: TC 002 There should be following items for creating/ updating test items; Name, Description, price
    Default min value, Default max value and created date as MM/DAY/YEAR

      Given Admin logins to the platform
      And Admin clicks on Items&Titles
      And Admin clicks on Test Item
      And Admin clicks on Create a New Test Item
      And Admin enters the test details name "<Test name>","<Description>", "<Price>", "<Min Value>", "<Max Value>"
      And Admin clicks on save test item
      Then Admin gets successfull message Test item is created



      Scenario: TC 003 Admin can view test items
        Given Admin logins to the platform
        And Admin clicks on Items&Titles
        And Admin clicks on Test Item
        When Admin clicks on a test item to view
        Then Admin verifies the title Test Item with the ID given


  Scenario: TC 004 Admin can delete test items
    Given Admin logins to the platform
    And Admin clicks on Items&Titles
    And Admin clicks on Test Item
    When Admin clicks on a test item to delete
    Then Admin verifies the delete is confirmed message


