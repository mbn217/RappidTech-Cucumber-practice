Feature: Palindrome Checker

  Scenario Outline: Check if a string is a palindrome
    Given I have a string "<string>"
    When I check if it is a palindrome
    Then the result should be "<result>"

    Examples:
      | string  | result |
      | racecar | true   |
      | hello   | false  |
      | radar   | true   |
      | level   | true   |
      | world   | false  |