Feature: Simple Caculator


  Scenario: Adding two numbers
    Given I have the following numbers
      | 2 |
      | 3 |
    When I add them together
    Then the result should be 5