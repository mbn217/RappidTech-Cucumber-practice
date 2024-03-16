Feature: Calculator for Outline Example

  Scenario Outline: Add two numbers for Outline Example
    Given I have entered <number1> into the calculator
    And I have entered <number2> into the calculator
    When I press add
    Then the result should be <sum> on the screen

    Examples:
      | number1 | number2 | sum |
      | 20      | 30      | 50  |
      | 40      | 50      | 90  |
      | 60      | 70      | 130 |
      | 80      | 90      | 170 |
      | 100     | 110     | 210 |