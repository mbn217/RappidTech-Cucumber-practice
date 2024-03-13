@bingsearch
Feature: Bing search functionality
  Agile Story:  As a user , when I am on the Bing search page
  I should be able tio search for anything and see relevant results


  Background:
    Given user is on the Bing search page
    When user searches for "selenium"

  @smoke @regression @all @search
  Scenario: Search result title verification
    Then the search result title should contain "selenium"


  @regression @search
  Scenario: Search result count verification
    Then the search result count should be greater than 0
