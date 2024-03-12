Feature: Dice Job search
  As a user , I should be able to search for jobs , using a keyword and zipcode
  then see results

  Scenario: User searches for a job
    Given user is on dice homepage
    When user enters keyword and zipcode
    Then user should see search result