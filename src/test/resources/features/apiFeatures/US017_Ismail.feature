Feature: US_017

  @API
  Scenario: TC 001 Create test items by API
    Given Admin sends post request to create a test item
    Then Admin receives the status code to verify successful test creation