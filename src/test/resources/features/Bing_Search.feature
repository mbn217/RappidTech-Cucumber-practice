Feature: Bing search functionality
  Agile Story:  As a user , when I am on the Bing search page
  I should be able tio search for anything and see relevant results

  Scenario: Search result title verification
    Given user is on the Bing search page
    When user searches for "selenium"
    Then the search result title should contain "selenium"



  Scenario: Search result count verification
    Given user is on the Bing search page
    When user searches for "selenium"
    Then the search result count should be greater than 0
