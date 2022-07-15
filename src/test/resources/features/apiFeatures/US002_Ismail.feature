Feature: US002


  Scenario Outline: TC 002 verify by API that the username provided is unique

    Given Admin enters the system with the username and password "<authUsername>","<authPassword>"
    Then the username "<username>" is verified by database that it's unqiue

    Examples:
    |authUsername|authPassword|username|
    |teamadmin86|teamadmin86  |sallamadfd|


    Scenario Outline:TC 004 staff should verify the patient details by ssn search
      Given Staff enters the system with the username and password "<authUsername>","<authPassword>","<ssn>"
      Then Staff searches for a patient by ssn id "<ssn>"

      Examples:
        |authUsername|authPassword|ssn|
      |staffteam86 |staffteam86 |321-54-4567|



