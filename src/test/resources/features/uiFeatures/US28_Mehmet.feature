
@US_28
Feature:US_28

  Background: open_url
    Given Admin  navigates to medunnaUrl homepage
    When  Admin navigate to the Sign In page
    And   Admin types username as "akbabaadmin"
    And  Admin types password as "Akbaba.1993"
    And Admin clicks Sign In button

    @CreateCountry
   Scenario: Create A  New Country
      And Clicks Items&Titles
      And Cliks Country segment
      And Click create a new Country
      Then write a country name in to the Name Box
      And Select a create date
      Then Click save button
      Then Verifies  A new country is created success message
