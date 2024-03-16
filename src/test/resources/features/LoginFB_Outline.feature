Feature: Scenario Outline Example
  As a user of the social network side
  I want to login to the side
  so that I can connect with my friends

  Scenario Outline: Login functionality for a social networking site
    Given User navigates to Facebook
    When User enter username "<username>" and password "<password>"
    Then login should be successful

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |